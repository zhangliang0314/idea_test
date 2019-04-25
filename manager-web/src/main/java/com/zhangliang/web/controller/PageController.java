package com.zhangliang.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:zhangliang
 * @Date:2019/4/25
 * @Description:com.zhangliang.web.controller
 * @version:1.0
 */
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
