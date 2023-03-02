package com.sun.contorller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @RequestMapping("/getUserByName/{name}")
    public Map<String,Object> getUser(@PathVariable("name") String name,
                                      @RequestParam("age") Integer age,
                                      @RequestParam("id") Integer id,
                                      @RequestParam Map<String,String> params){

        Map<String,Object> map = new HashMap<>();

        map.put("Name",name);
        map.put("Age",age);
        map.put("Id",id);
        map.put("Params",params);
//        map.put("User-Agent",userAgent);
//        map.put("Headers",header);
        return map;
    }
}
