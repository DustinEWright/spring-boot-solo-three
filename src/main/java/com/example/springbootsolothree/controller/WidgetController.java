package com.example.springbootsolothree.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DW 07/04/20
 */
@Controller
public class WidgetController {

    @RequestMapping("/widget")
    public String getWidget() {

        return "widget";
    }

}
