package com.example.dbproject.Utils;

import com.alibaba.fastjson.JSONObject;
import com.example.dbproject.entity.SteamDetailed;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;
import java.util.Map;

/**
 */
public class DetailUtils {
	private static final long serialVersionUID = 1L;
	// 列表数据
	private List<SteamDetailed> rows;

	private List<?> screenshots;



	public DetailUtils(List<SteamDetailed> list, List<?> screenshot) {
		this.rows = list;
		this.screenshots = screenshot;
	}

	public DetailUtils(){

	}

	public List<SteamDetailed> getRows() {
		return rows;
	}

	public void setRows(List<SteamDetailed> rows) {
		this.rows = rows;
	}

	public List<?> getScreenshots() {
		return screenshots;
	}

	public void setScreenshots(List<?> screenshots) {
		this.screenshots = screenshots;
	}
}
