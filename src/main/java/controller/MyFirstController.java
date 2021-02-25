package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pojo.Role;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

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

    @RequestMapping("param")
    public void getParam1(HttpSession session, HttpServletRequest request){
        //Spring MVC会自动解析代码中的方法参数 session,request
        //存在一个问题就是与Servlet关联性太强，不利于扩展
    }

    @RequestMapping(value = "param1",method = RequestMethod.GET)
    public void getParam1(@RequestParam("id") long id, @SessionAttribute("username")String userName){
        //也可以用过注解RequestParam获取链接上的参数
        //注意此时该参数默认是必须有的，可通过required设置是否必须以及defaultValue设置默认值
        System.out.println(id);

        //也可以通过注解SessionAttribute获取session数据
    }

    @RequestMapping("param2")
    public void getParam2(String userName, Role role){
        //参数简单，可以直接获取（名称一致）
        System.out.println(userName);
        //也可以通过pojo封装获取
        System.out.println(role.toString());
    }

    @RequestMapping("param3")
    public void getParam3(@RequestBody List<String> roleList){
        //通过注解RequestBody接收json格式字符串，自动解析
    }




}
