package com.nf147.pest.web;

import com.nf147.pest.dao.CategoryMapper;
import com.nf147.pest.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryConsole {
    @Autowired
    CategoryMapper categoryMapper;

    /*@GetMapping("/page")
    public ModelAndView PetAll(int id) {
        ModelAndView mv = new ModelAndView("home_page");
        List<Category> categoryList = categoryMapper.deleteByPrimaryKey(id);
        mv.addObject("categoryList",categoryList);
        return mv;
    };*/
}
