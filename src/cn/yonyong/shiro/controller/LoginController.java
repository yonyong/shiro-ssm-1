package cn.yonyong.shiro.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class LoginController {
	@RequestMapping(value="/login",method=RequestMethod.POST) 
	public String login(Model model,String name, String password) {
        Subject subject = SecurityUtils.getSubject();  
        UsernamePasswordToken token = new UsernamePasswordToken(name, password);  
        try {
            //此处调用shiro自带的login方法，携带UsernamePasswordToken进入到DatabaseRealm的身份验证方法doGetAuthenticationInfo
            subject.login(token);
            Session session=subject.getSession();
            session.setAttribute("subject", subject);
            return "redirect:index";
            
        } catch (AuthenticationException e) {  
            model.addAttribute("error", "验证失败");  
            return "login"; 
        }  
	}
	


}
