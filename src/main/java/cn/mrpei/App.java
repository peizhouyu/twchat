package cn.mrpei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;

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
@SpringBootApplication
public class App {

//    @Bean
//    public TomcatServletWebServerFactory servletContainer(){
//        return new TomcatServletWebServerFactory(80) ;
//    }


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
