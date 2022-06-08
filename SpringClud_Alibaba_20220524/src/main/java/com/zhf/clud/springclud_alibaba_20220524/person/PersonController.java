package com.zhf.clud.springclud_alibaba_20220524.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonalService personalService;

    @GetMapping("/getPerson")
    public String getPerson(){

        return  personalService.getPerson();
    }
}
