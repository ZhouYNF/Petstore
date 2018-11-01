package com.nf147.pest.web;

import com.nf147.pest.dao.PetstorePetMapper;
import com.nf147.pest.entity.PetstorePet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class PetConsole {

    @Autowired
    private PetstorePetMapper petMapper;

    @RequestMapping(value = "/home_page",method = RequestMethod.GET)
    public String home_page ( Model model) {
        List<PetstorePet> petList = petMapper.selectAll() ;
        model.addAttribute("petList", petList);
        return "home_page";
    }


}
