package edu.wctc.pmnh;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Step")
public class StepController {

    @GetMapping("/1")
    public String showStep1() {
        return "pages/Step-1";
    }
    @RequestMapping("/1")
    public String showStep1Request() {
        return "pages/Step-1";
    }
    @PostMapping("/1")
    public String showStep1Post(){
        return "redirect:pages/Step-1";
    }


    @GetMapping("/2")
    public String showStep2() {
        return "pages/Step-2";
    }
    @PostMapping("/2")
    public String showStep2Post(){
        return "redirect:pages/Step-2";
    }

    @GetMapping("/3")
    public String showStep3() {
        return "pages/Step-3";
    }
    @PostMapping("/3")
    public String showStep3Post(){
        return "redirect:pages/Step-3";
    }

}


