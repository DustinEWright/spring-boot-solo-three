package com.example.springbootsolothree.controller;


import com.example.springbootsolothree.repositories.WidgetRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 3) Have a HTML form that does a HTTP POST to a controller that inserts a row into the database
 * (confirm with h2-console)
 * 4) Have a HTTP GET controller endpoint that outputs to the web browser each row in a table
 */

/**
 * Created by DW 07/04/20
 */
@Controller
public class WidgetController {

    private final WidgetRepository widgetRepository;

    public WidgetController(WidgetRepository widgetRepository) {
        this.widgetRepository = widgetRepository;
    }

    @RequestMapping("/widget")
    public String getWidget(Model model) {

        model.addAttribute("widget", widgetRepository.findAll());

        return "widget";
    }

}
