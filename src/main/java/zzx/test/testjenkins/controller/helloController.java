package zzx.test.testjenkins.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class helloController {

    @RequestMapping("hello")
    public String sayHello(){
        return "success hello word ";
    }

    //sdfsfsd
}
