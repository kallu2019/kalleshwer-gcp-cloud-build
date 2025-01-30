package com.example.gcp.kb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/disp")
    public String getDisp(){
        return "Welcome to CTS Training !! [Thanks, Kalleshwer Bhatade.]";
    }


}
