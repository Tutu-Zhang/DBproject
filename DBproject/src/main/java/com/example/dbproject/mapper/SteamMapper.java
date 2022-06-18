package com.example.dbproject.mapper;

import com.example.dbproject.entity.Steam;

import com.example.dbproject.entity.SteamDetailed;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Mapper
@Repository
public interface SteamMapper{

    List<Steam> list(Map<String,Object> map);

    List<SteamDetailed> DetailList(Map<String,Object> map);

    int count(Map<String,Object> map);
}
