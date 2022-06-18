package com.example.dbproject.service.Steam;

import com.example.dbproject.entity.Steam;
import com.example.dbproject.entity.SteamDetailed;

import java.util.List;
import java.util.Map;


public interface SteamService {
    List<Steam> list(Map<String, Object> map);

    List<SteamDetailed> DetailList(Map<String,Object> map);

    int count(Map<String, Object> map);
}
