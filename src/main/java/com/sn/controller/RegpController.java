package com.sn.controller;

import com.sn.entity.Regpr;
import com.sn.service.RegpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/regp")
public class RegpController {
    private RegpService regpservice;

    public RegpController(RegpService regpservice) {
        this.regpservice = regpservice;
    }

    @GetMapping
    public List<Regpr> allregp(){
        List<Regpr> allregpd=regpservice.getallreg();
        return allregpd;
    }
}
