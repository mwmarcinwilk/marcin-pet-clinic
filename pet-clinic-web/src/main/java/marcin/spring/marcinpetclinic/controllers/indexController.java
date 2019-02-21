package marcin.spring.marcinpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @RequestMapping({"", "/", "index", "templates/index.html"})
    public String index() {
        return "index";
    }
}
