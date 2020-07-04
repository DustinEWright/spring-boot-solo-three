package com.example.springbootsolothree.controller;


import com.example.springbootsolothree.domain.Widget;
import com.example.springbootsolothree.repositories.WidgetRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 3) Have a HTML form that does a HTTP POST to a controller that inserts a row into the database
 * (confirm with h2-console)
 * https://www.baeldung.com/spring-requestmapping
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

    // 	public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
    @PostMapping("/widget")
    public String postWidget(Model model, Widget widget) {
        widgetRepository.save(widget);
        Iterable<Widget> list = widgetRepository.findAll();
        model.addAttribute("widgets", list);

        return "widget/list";
    }

    @RequestMapping("/widget")
    public String getWidget(Model model) {
        Iterable<Widget> list = widgetRepository.findAll();
        model.addAttribute("widgets", list);

        return "widget/list";
    }

}
