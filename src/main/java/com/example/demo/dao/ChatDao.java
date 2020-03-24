package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.DbManager;
import com.example.demo.vo.ChatVo;

@Repository
public class ChatDao {
	public List<ChatVo>listChat(){
		return DbManager.listChat();
	}
}
