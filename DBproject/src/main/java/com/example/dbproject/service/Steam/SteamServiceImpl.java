package com.example.dbproject.service;

import com.example.dbproject.entity.Steam;
import com.example.dbproject.mapper.SteamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SteamServiceImpl implements SteamService{

    @Autowired
    private SteamMapper steamMapper;

    @Override
    public List<Steam> list(Map<String, Object> map){
        return steamMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map){
        return steamMapper.count(map);
    }
}
