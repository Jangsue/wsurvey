package com.woongjin.pjt.wsurveyapi;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController(value = "/user")
public class UserController {
    @GetMapping
    public List<String> list(){
        return Arrays.asList("Jang su bin, Jang Sue Bin");
    }
}
