package com.nf147.pest.web;


import com.nf147.pest.dao.UserMapper;
import com.nf147.pest.entity.Apiresponse;
import com.nf147.pest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/User")
public class UserConsole {

    @Autowired
    UserMapper userMapper;

    @PostMapping
    @ResponseBody
    public Apiresponse addUser(User user) {
        if (userMapper.insert(user) != 0) {
            return new Apiresponse();
        }
        return new Apiresponse();
    }

    @PostMapping("/createWithArray")
    @ResponseBody
    public Apiresponse addUser(ArrayList<User> list) {
        for (User user : list) {
            userMapper.insert(user);
        }
        return new Apiresponse();
    }

    @PostMapping("/createWithList")
    @ResponseBody
    public Apiresponse addUser(List<User> list) {
        for (User user : list) {
            userMapper.insert(user);
        }
        return new Apiresponse();
    }
    @GetMapping("/login")
    public String homePage(){
        return "login";
    }

    @GetMapping("/login")
    @ResponseBody
    public Apiresponse login(int user_id,String user_password) {
        if (userMapper.login(new User(user_id,user_password)) == null) {
            return new Apiresponse();
        } else {
            return new Apiresponse();
        }
    }

    @GetMapping("/logout")
    @ResponseBody
    public Apiresponse logout(@SessionAttribute User user) {
        userMapper.updateStatus(user);
        return new Apiresponse();
    }

    @GetMapping("/{username}")
    @ResponseBody
    public Apiresponse findByUserName(@PathVariable String userName) {
        if (userName == "") {
            return new Apiresponse();
        } else {
            if (userMapper.selectByUserName(userName) != null) {
                return new Apiresponse();
            } else {
                return new Apiresponse();
            }
        }
    }

    @PutMapping("/{username}")
    @ResponseBody
    public Apiresponse updateUser(@PathVariable String userName) {
        if (userName == "") {
            return new Apiresponse();
        } else {
            User user = userMapper.selectByUserName(userName);
            if (user != null) {
                userMapper.updateByPrimaryKey(user);
            } else {
                return new Apiresponse();
            }
        }
        return new Apiresponse();
    }

    @DeleteMapping("/{username}")
    @ResponseBody
    public Apiresponse deleteUser(@PathVariable String userName){
        if (userName == "") {
            return new Apiresponse();
        } else {
            User user = userMapper.selectByUserName(userName);
            if (user != null) {
                userMapper.deleteByUserName(userName);
            } else {
                return new Apiresponse();
            }
        }
        return new Apiresponse();
    }



}
