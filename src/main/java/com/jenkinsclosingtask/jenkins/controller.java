package com.jenkinsclosingtask.jenkins;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class controller {

    @RequestMapping("/")
    public ModelAndView breakingNews(Model model){

        String URL = "http://www.ynet.co.il/Integration/StoryRss2.xml";
        String html_table = xmlToTable.getTable(URL);
        model.addAttribute("content", html_table);
        ModelAndView modelView = new ModelAndView();
        modelView.setViewName("index");

        return modelView;
    }


}
