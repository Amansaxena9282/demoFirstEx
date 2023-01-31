package com.example.demoFirstEx.FirstController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/Firstapp")
    public String Firstapp()
    {
        return "This is FirstApplication";
    }
    @PostMapping("/postvalues")
    public String postValues(@RequestBody String studentName)
    {
        return studentName;
    }
}
