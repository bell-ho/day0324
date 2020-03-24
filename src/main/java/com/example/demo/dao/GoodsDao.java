package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.DbManager;
import com.example.demo.vo.GoodsVo;

@Repository //객체 자동생성
public class GoodsDao {
	public List<GoodsVo>listAll(){
		return DbManager.listAll();
	}
}
