package com.assignment.designpattern.Controller;

import com.assignment.designpattern.Model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("dp/composite")
public class ControllerDesignPattern {
    @GetMapping("/client/all")
    public ArrayList<Creater> getAll()
    {
        ArrayList ctrs = new ArrayList<Creater>();
        ctrs.add(new Creater(1, "Bagaa"));
        ctrs.add(new Creater(2, "Galaa"));
        ctrs.add(new Creater(3, "DFF"));
        ctrs.add(new Creater(4, "LLG"));
        return ctrs;
    }

//    @GetMapping("/client/{id}")
//    public Creater getClient(@PathVariable String id)
//    {
//        ArrayList ctrs = new ArrayList<Creater>();
//        ctrs.add(new Creater(1, "Bagaa"));
//        ctrs.add(new Creater(2, "Galaa"));
//        ctrs.add(new Creater(3, "DFF"));
//        ctrs.add(new Creater(4, "LLG"));
//
//        Creater filterCtr = ctrs.stream().filter(f -> f.getId() == Integer.parseInt(id)).findFirst().get();
//        return filterCtr;
//    }

    @GetMapping("/html")
    public String generate(){
        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");
        HtmlTag p1 = new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");
        parentTag.addChildTag(p1);
        HtmlTag child1 = new HtmlElement("<h1>");
        child1.setStartTag("<h1>");
        child1.setEndTag("</h1>");
        child1.setTagBody("- Header1 -");
        p1.addChildTag(child1);
        child1 = new HtmlElement("<h2>");
        child1.setStartTag("<h2>");
        child1.setEndTag("</h3>");
        child1.setTagBody("- Header2 -");
        p1.addChildTag(child1);
        child1 = new HtmlElement("<h3>");
        child1.setStartTag("<h3>");
        child1.setEndTag("</h3>");
        child1.setTagBody("- Header3 -");
        p1.addChildTag(child1);
        child1 = new HtmlElement("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setTagBody("-- Testing html tag library --");
        p1.addChildTag(child1);
        child1 = new HtmlElement("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setTagBody("-- Paragraph 2 --");
        p1.addChildTag(child1);

        child1 = new HtmlElement("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setTagBody("-- Paragraph 3 --");
        p1.addChildTag(child1);
        return parentTag.generateHtml();
        //return "hello";
    }
}
