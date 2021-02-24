package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//表明当请求的URL在/my下的时候才有该控制器响应
@RequestMapping("/my")
public class MyFirstController {

    @RequestMapping("/index")
    public ModelAndView index(){
        //模型和视图
        ModelAndView modelAndView = new ModelAndView();
        //视图逻辑名为index
        modelAndView.setViewName("index");
        //返回视图模型
        return modelAndView;
    }
}
