package com.example.dbproject.service;

import com.example.dbproject.entity.Steam;

import java.util.List;
import java.util.Map;


public interface SteamService {
    List<Steam> list(Map<String, Object> map);

    int count(Map<String, Object> map);
}
