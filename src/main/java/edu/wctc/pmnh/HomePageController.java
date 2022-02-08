package edu.wctc.pmnh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

        @RequestMapping("/forward-me")
        public String doForward() {
            return "forward:/Step/1";
        }

        @RequestMapping("/redirect-me")
        public String doRedirect() {
            return "redirect:http://www.wctc.edu";
//        return "redirect:/glaciers/trail";
        }

        @RequestMapping("/")
        public String showHomePage() {
            return "homepage";
        }
}


