package com.nebula.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页控制器
 *
 * @author Nebula Unlimited
 */

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("name", "nebula");
        return "index";
    }
}
