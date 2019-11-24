package com.example.controller;

import com.example.config.Persion;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class Test1Controller
{
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Persion persion;
    @RequestMapping("/index")
    public String index(@RequestParam("id") int id,  Model mode)
    {
        mode.addAttribute("name", "哈哈哈");
        mode.addAttribute("list", Arrays.asList("是的", "嗯嗯"));
        log.info(persion.toString());
        return "index";
    }

    @GetMapping("/index/{id}")
    public String d(@PathVariable("id") int id) {
        return "";
    }
}
