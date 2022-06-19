package com.example.dbproject.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.dbproject.Utils.DetailUtils;
import com.example.dbproject.Utils.PageUtils;
import com.example.dbproject.Utils.Query;
import com.example.dbproject.entity.Steam;
import com.example.dbproject.entity.SteamDetailed;
import com.example.dbproject.service.Steam.SteamServiceImpl;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

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
    public DetailUtils listDetails(@RequestBody Map<String, Object> params) throws JsonProcessingException {
        DetailUtils detailUtils = new DetailUtils();

        if(params.get("appid") == null && params.get("name") == null){
            return detailUtils;
        }

        List<SteamDetailed> steamData = steamService.DetailList(params);
        String screen = steamData.get(0).getScreenshots();
        //screen = screen.replaceAll("^(\\[+)", "");
        //screen = screen.replaceAll("]*$", "");

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        List<?> screenshot = mapper.readValue(screen, new TypeReference<List<?>>() {}) ;

        detailUtils = new DetailUtils(steamData, screenshot);
        return detailUtils;
    }


}
