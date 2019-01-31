package com.blueslin.reactspb3.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpbControl {

    @RequestMapping("/aa")
    public String doSome() {
        System.out.println("aa");
        return "aa";
    }
}
