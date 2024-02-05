package org.launchcode.skillstracker.controllers;

import org.launchcode.skillstracker.dtos.FormDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("")
    public String displayIndex(){
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
    @GetMapping("form")
    public String renderForm(){
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

//    @PostMapping("form")
//    public String processForm(@RequestParam String name, @RequestParam String favone, @RequestParam String favtwo,@RequestParam String favthree){
//        return "<h1> " +
//                name +
//                "</h1>" +
//                "<ol><li>" +
//                favone +
//                "</li><li>" +
//                favtwo +
//                "</li><li>" +
//                favthree +
//                "</li></ol>"
//                ;
//    }

    @PostMapping("form")
    public String processForm(FormDTO formDTO){

        if (formDTO.getName().isBlank()){
            return "<h1>WHAT IS YOUR NAME</h1>";
        }

        return "<h1> " +
                formDTO.getName() +
                "</h1>" +
                "<ol><li>" +
                formDTO.getFavone() +
                "</li><li>" +
                formDTO.getFavtwo() +
                "</li><li>" +
                formDTO.getFavthree() +
                "</li></ol>"
                ;
    }
}
