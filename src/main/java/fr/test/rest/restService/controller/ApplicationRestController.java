package fr.test.rest.restService.controller;

import fr.test.rest.restService.dto.InformationDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationRestController {

    @RequestMapping("/")
    public String begin() {//Welcome page, non-rest
        return "Begin to Rest service";
    }

    @RequestMapping(value = "/rest/{information}", produces = "application/json; charset=UTF-8")
    public InformationDto message(@PathVariable String information) {

        InformationDto info = new InformationDto(information, "Description " + information);
        return info;
    }
}
