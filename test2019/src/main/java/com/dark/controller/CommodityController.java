package com.dark.controller;

import com.dark.domain.Commodity;
import com.dark.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/comm")
public class CommodityController {
    @Autowired
    private CommodityService commodityService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<Commodity> lists = commodityService.findAll();
        model.addAttribute("lists", lists);
        return "list";
    }

    @RequestMapping("/findById")
    public String findById(Integer id, Model model) {
        Commodity commodity = commodityService.findById(id);
        model.addAttribute("commodity", commodity);
        return "update";
    }

    @RequestMapping("/update")
    public String update(Commodity commodity) {
        commodityService.update(commodity);
        return "redirect:/comm/findAll.do";
    }
}
