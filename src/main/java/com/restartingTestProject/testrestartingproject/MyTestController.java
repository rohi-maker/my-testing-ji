package com.restartingTestProject.testrestartingproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/testit")
public class MyTestController {
    @GetMapping("/demo")
    public String testController() {
        return "THIS IS TEST RESPONSE";
    }
}
