package cn.mrpei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author peizhouyu (大数据与智能供应链事业部-大数据平台部-平台产品研发部)
 * @version V1.0.0
 * @description
 * @date 2019/4/9
 * @last-modified:
 * @class cn.mrpei.controller
 * @copyright Copyright © 2004-2019 京东JD.com ALL Right Reserved
 * @see
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/hello")
    public String hello(){
        return "index";
    }

    @RequestMapping("/say")
    @ResponseBody
    public String index(String name){
        return "Hello" + name;
    }
}
