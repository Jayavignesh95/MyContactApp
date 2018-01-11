package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

import com.google.apphosting.utils.config.ClientDeployYamlMaker.Request;

@Controller
public class RegisterController {
    
	@RequestMapping(value="register")
	public String register(@ModelAttribute("frmdata") User user, ModelMap model,BindingResult res)
	{
		System.out.println("Hello");
		//user.setName(request.);
		model.addAttribute("name",user.getName());
		model.addAttribute("email",user.getRollno());
		model.addAttribute("paswword",user.getPassword());
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		System.out.println(user.getRollno());
		System.out.println(res);
		return "welcome";
		
	}
	
	
	@RequestMapping(value="display")
	public String display(@RequestParam() String name,Model mp)
	{
		
		 mp.addAttribute("name",name);
		System.out.println(name);
//		mp.addAttribute("email",email);
//		mp.addAttribute("pass",password);
		return "hel";
	}
	
	
	
	
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String submit(@ModelAttribute("employee") User user , 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", user.getName());
        model.addAttribute("contactNumber",user.getRollno());
        model.addAttribute("id", user.getPassword());
        return "hel";
    }
		
}
