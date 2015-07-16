package com.apress.pss.terrormovies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by abhin on 7/15/2015.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping(method = RequestMethod.POST,value = "/movies")
    @ResponseBody
    public String createMovie(@RequestBody String movie){
        System.out.println("Adding movie!! "+movie);
        return "created"+"!";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/movies")
    @ResponseBody
    public String createMovie() {
        return "movie X";
    }
}
