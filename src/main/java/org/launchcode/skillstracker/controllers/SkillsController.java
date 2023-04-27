package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.font.TextHitInfo;

@Controller

public class SkillsController {
    @GetMapping ("/")
    @ResponseBody
    public String display(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>"+
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "<li>C++</li>" +
                "<li>C#</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String displayForm(){
            return  "<form method = \"post\">\n" +
                    "<label for = \"name\">Enter your name:</label>\n" +
                    "<input name = \"name\"/>\n" +
                    "<br/>\n" +
                    "<label for = \"firstFav\">1st Favorite</label>\n" +
                    "<select name = \"firstFav\">\n" +
                        "<option></option>\n" +
                        "<option value = \"Java\">Java</option>\n" +
                        "<option value = \"JavaScript\">JavaScript</option>\n" +
                        "<option value = \"Python\">Python</option>\n" +
                        "<option value = \"C++\">C++</option>\n" +
                        "<option value = \"C#\">C#</option>\n"+
                    "</select>" +
                    "<br/>\n" +
                    "<label for = \"secondFav\">2nd Favorite</label>\n" +
                    "<select name = \"secondFav\">\n" +
                    "<option></option>\n" +
                    "<option value = \"Java\">Java</option>\n" +
                    "<option value = \"JavaScript\">JavaScript</option>\n" +
                    "<option value = \"Python\">Python</option>\n" +
                    "<option value = \"C++\">C++</option>\n" +
                    "<option value = \"C#\">C#</option>\n"+
                    "</select>" +
                    "<br/>\n" +
                    "<label for = \"thirdFav\">3rd Favorite</label>\n" +
                    "<select name = \"thirdFav\">\n" +
                    "<option></option>\n" +
                    "<option value = \"Java\">Java</option>\n" +
                    "<option value = \"JavaScript\">JavaScript</option>\n" +
                    "<option value = \"Python\">Python</option>\n" +
                    "<option value = \"C++\">C++</option>\n" +
                    "<option value = \"C#\">C#</option>\n"+
                    "</select>" +

                    "<br/>\n" +
                    "<input type =\"submit\" />\n" +

                    "</form>";


    }

    @PostMapping("/form")
    @ResponseBody
    public String formResponse(@RequestParam String name, @RequestParam String firstFav, @RequestParam String secondFav, @RequestParam String thirdFav) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstFav + "</li>" +
                "<li>" + secondFav + "</li>" +
                "<li>" + thirdFav + "</li>" +
                "</ol>";


    }

}
