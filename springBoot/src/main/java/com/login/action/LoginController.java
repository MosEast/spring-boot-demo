package com.login.action;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.login.pojo.User;

@Controller
public class LoginController {

    @RequestMapping(value="/index")
    public String index() {
        return "login";
    }
    @RequestMapping(value="/login")
    public @ResponseBody JSONObject login(@Valid User user, BindingResult result, Model model) {
    	JSONObject data = new JSONObject();
        if (result.hasErrors()) {
            List<ObjectError> error = result.getAllErrors();
            String message = "";
            for (ObjectError e : error) {
            	message =e.getDefaultMessage();
            }
            data.put("message", message);
            data.put("success", false);
        }else{
        	 data.put("data", user);
             data.put("success", true);
             data.put("message", "成功！");
        }
        return data;
    }
}
