package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.db.DbManager;
import com.example.demo.vo.DialogVo;

@Repository
public class DialogDao {
	
	public List<DialogVo> listDialog() {
		return DbManager.listDialog();
	}
	public int insertDialog(DialogVo d) {
		return DbManager.insertDialog(d);
	}
}
