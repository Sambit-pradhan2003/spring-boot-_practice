package com.sn.service;

import com.sn.entity.Regpr;
import com.sn.repository.RegprRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegpService {
    private RegprRepository regprepo;

    public RegpService(RegprRepository regprepo) {
        this.regprepo = regprepo;
    }

    public List<Regpr> getallreg() {
        List<Regpr> all = regprepo.findAll();
        return all;
    }
}
