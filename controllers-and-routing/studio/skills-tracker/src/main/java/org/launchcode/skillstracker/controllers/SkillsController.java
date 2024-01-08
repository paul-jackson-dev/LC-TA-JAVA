package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("")
    public static String displayIndex(){
        return "<h1>Skills Tracker</h1>" +
                "<h2>skills to pay the bills</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Javascript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "<br>" +
                "<a href=\"form\">...why not fill out a form?</a>";
    }
    @GetMapping("/form")
    public static String renderForm(){
        return "<form action=\"/form\"\n method= \"post\">" +
                "  <label for=\"name\">Name:</label><br>\n" +
                "  <input type=\"text\" id=\"name\" name=\"name\" value=\"\"><br><br>\n" +

                " <label for=\"favone\">favorite language:</label><br>\n" +
                "<select id=\"favone\" name=\"favone\">\n" +
                "  <option value=\"Javascript\">Javascript</option>\n" +
                "  <option value=\"Java\">Java</option>\n" +
                "  <option value=\"Python\">Python</option>\n" +
                "</select>" +
                "<br><br>" +

                " <label for=\"favtwo\">2nd favorite language:</label><br>\n" +
                "<select id=\"favtwo\" name=\"favtwo\">\n" +
                "  <option value=\"Javascript\">Javascript</option>\n" +
                "  <option value=\"Java\">Java</option>\n" +
                "  <option value=\"Python\">Python</option>\n" +
                "</select>" +
                "<br><br>" +

                " <label for=\"favthree\">3rd favorite language:</label><br>\n" +
                "<select id=\"favthree\" name=\"favthree\">\n" +
                "  <option value=\"Javascript\">Javascript</option>\n" +
                "  <option value=\"Java\">Java</option>\n" +
                "  <option value=\"Python\">Python</option>\n" +
                "</select>" +
                "<br><br>" +


                "<input type=\"submit\" value=\"Submit\">\n" +

                "</form> ";
    }

    @PostMapping("/form")
    public static String processForm(@RequestParam String name, @RequestParam String favone, @RequestParam String favtwo,@RequestParam String favthree){
        return "<h1> " +
                name +
                "</h1>" +
                "<ol><li>" +
                favone +
                "</li><li>" +
                favtwo +
                "</li><li>" +
                favthree +
                "</li></ol>"
                ;
    }
}
