package com.nf147.pest.web;

import com.nf147.pest.dao.PetstoreUserMapper;
import com.nf147.pest.entity.PetstorePet;
import com.nf147.pest.entity.PetstoreUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/User")
public class UserConsole {
    @Autowired
    private PetstoreUserMapper petstoreUserMapper;

    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    public String getAllUser ( Model model) {
        List<PetstoreUser> userList = petstoreUserMapper.selectAll() ;
        model.addAttribute("userList", userList);
        return "";
    }

    @RequestMapping(value = "/delUser",method = RequestMethod.GET)
    public String delUser ( Model model,int id) {
        int delete = petstoreUserMapper.deleteByPrimaryKey(id) ;
        return "";
    }


}
