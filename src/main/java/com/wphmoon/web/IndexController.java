package com.wphmoon.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class IndexController {
  
    @RequestMapping("/saveSession")
    String saveSession(HttpSession session) {
        session.setAttribute("mySession", "lalala");
        return session.getId();
    }
    
    @RequestMapping("/getSession")
    String getSession(HttpSession session) {
        String mySessionString = session.getAttribute("mySession").toString();
        return mySessionString;
    }
}