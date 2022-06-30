package com.jenkinsclosingtask.jenkins;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import java.util.List;

@RestController
public class controller {

    @RequestMapping("/")
    public ModelAndView breakingNews(Model model){
//    public String breakingNews(Model model){

        String URL = "http://www.ynet.co.il/Integration/StoryRss2.xml";
        String myList = getxml.getTable(URL);
        String test = "test";
        model.addAttribute("content", myList);
        ModelAndView modelView = new ModelAndView();
        modelView.setViewName("index");

//        return  "hello";
        return modelView;
    }


}
