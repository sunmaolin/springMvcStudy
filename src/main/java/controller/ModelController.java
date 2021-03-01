package controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import pojo.Role;

/**
 * 数据模型，未测试，只写了方法
 */
public class ModelController {

    public ModelAndView testModelMap(ModelMap modelMap){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        Role role = new Role();
        modelMap.addAttribute("role",role);
        return modelAndView;
    }

    public ModelAndView testModel(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        Role role = new Role();
        model.addAttribute("role",role);
        return modelAndView;
    }

    public ModelAndView testModelAndView(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        Role role = new Role();
        modelAndView.addObject("role",role);
        return modelAndView;
    }
}
