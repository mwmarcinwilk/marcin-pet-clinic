package marcin.spring.marcinpetclinic.controllers;

import marcin.spring.marcinpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    private OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index"})
    public String listOwner(Model model) {

        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

}
