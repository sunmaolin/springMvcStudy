package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import pojo.Role;
import service.RoleService;

@RequestMapping("/role")
@Controller
public class RoleController {

    @Autowired
    RoleService roleService;

    @RequestMapping(value = "getRole" , method = RequestMethod.GET)
    public ModelAndView getRole(@RequestParam("id") int roleId){
        Role role = roleService.getRole(roleId);
        System.out.println(role);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("role",role);
        //指定视图类型，返回json数据
        modelAndView.setView(new MappingJackson2JsonView());
        return modelAndView;
    }

}
