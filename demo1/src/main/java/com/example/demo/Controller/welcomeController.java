package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
//لكل ماب بيكون فيه باث مثلا برجع بحذف بعدل ابغى ارجع كلهم بيكون لهم باث يعني صفحة باث واAips
public class welcomeController {
    @GetMapping("/get")
    public String hellowrld(){
        return "hello word";
    }
    @GetMapping(path = "/age")
    public String getage(){
        return " My age is 25";
    }
    @GetMapping(path = "/check/status")
    public String getchekS(){
        return "Everything is Okay!";
    }
    @GetMapping(path = "/health")
    public String getname(){
        return "Server health is up and running";
    }


}
