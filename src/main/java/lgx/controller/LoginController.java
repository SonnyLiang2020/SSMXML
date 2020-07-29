package lgx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import lgx.entity.SysUser;
import lgx.service.SysUserService;

@Controller
public class LoginController {
	
	@Autowired
	private SysUserService userService;
	
	@PostMapping("/login")
	public String login(SysUser user, Model model) {
		if("".equals(user.getUsername()) || "".equals(user.getPassword()) ) {
			model.addAttribute("msg", "用户名或密码为空。。。");
			return "error";
		}
		user = userService.findOne(user);
		if(user != null) {
			model.addAttribute("users", userService.findAll());
			return "index";
		}else {
			model.addAttribute("msg", "没有注册过这个。。。");
			return "error";
		}
	}
	
	@PostMapping("/register")
	public String register(SysUser user, Model model) {
		if("".equals(user.getUsername()) || "".equals(user.getPassword()) )
			return "error";
		user.getUsername().trim();
		if(userService.addOne(user) == 1) {
			model.addAttribute("msg", "注册成功了，可以登陆了亲。。。");
			return "login";
		}
		else
			model.addAttribute("msg", "注册失败了，请重试一下。亲。。。");
			return "error";
	}

}
