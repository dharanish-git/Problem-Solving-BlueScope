package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class HomeController {

    @GetMapping("/getAll")
    public Map<Integer,String>getAll(){
    Map<Integer,String>map=new HashMap<>();
    map.put(1,"Dharanish");
    map.put(2,"Arun");
    return map;
}
}
