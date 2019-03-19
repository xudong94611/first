package com.cim.cimConfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cimConfig")
public class CimConfigBaseController {
    @GetMapping
    String start() {
        return "redirect:/cimConfig/antennaAttributes";
    }

    @GetMapping("getTable")
    String getTable(@PathVariable("table") int table) {
        switch (table) {
            default:
                return "/cimConfig/equipmentAttributes";
            case 1:
                return "/cimConfig/antennaAttributes";
            case 2:
                return "/cimConfig/equipmentAttributes";
            case 3:
                return "/cimConfig/equipmentAttributes";
        }
    }
}
