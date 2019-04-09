package cn.mrpei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


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
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
