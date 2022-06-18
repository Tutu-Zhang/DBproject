package com.example.dbproject.controller;

import com.example.dbproject.Utils.PageUtils;
import com.example.dbproject.Utils.Query;
import com.example.dbproject.entity.Steam;
import com.example.dbproject.entity.SteamDetailed;
import com.example.dbproject.service.Steam.SteamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/steam")
public class SteamController {

    @Autowired
    public SteamServiceImpl steamService;

    @ResponseBody
    @PostMapping("/list")
    public PageUtils list(@RequestBody Map<String, Object> params){
        Query query = new Query(params);
        List<Steam> steamData = steamService.list(query);
        int total = steamService.count(query);
        PageUtils pageUtils = new PageUtils(steamData, total,query.getCurrPage(),query.getPageSize());
        return pageUtils;
    }

    @ResponseBody
    @PostMapping("/listDetails")
    public List<?> listDetails(@RequestBody Map<String, Object> params){
        if(params.get("appid") == null && params.get("name") == null){
            List a = new ArrayList();
            return a;
        }

        List<SteamDetailed> steamData = steamService.DetailList(params);
        return steamData;
    }


}
