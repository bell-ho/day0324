package com.example.demo.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.BookVo;
import com.example.demo.vo.CartVo;
import com.example.demo.vo.ChatVo;
import com.example.demo.vo.DialogVo;
import com.example.demo.vo.GoodsVo;

public class DbManager {
	private static SqlSessionFactory factory;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/example/demo/db/sqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static List<GoodsVo>listAll(){
		SqlSession session = factory.openSession();
		List<GoodsVo>list = session.selectList("goods.select");
		session.close();
		return list;
	}
	public static List<ChatVo>listChat(){
		SqlSession session = factory.openSession();
		List<ChatVo>list = session.selectList("chat.select");
		session.close();
		return list;
	}
	public static int insertChat(ChatVo c) {
		int re= -1;
		SqlSession session = factory.openSession(true);
		re=session.insert("chat.insert",c);
		session.close();
		return re;
	}
//	========================dialog========================================
	public static List<DialogVo>listDialog(){
		SqlSession session = factory.openSession();
		List<DialogVo>list = session.selectList("dialog.select");
		session.close();
		return list;
	}
	public static int insertDialog(DialogVo d) {
		int re= -1;
		SqlSession session = factory.openSession(true);
		re=session.insert("dialog.insert",d);
		session.close();
		return re;
	}
//	========================cart========================================
	public static int insertCart(CartVo c) {
		int re= -1;
		SqlSession session = factory.openSession(true);
		re=session.insert("dialog.insert",c);
		session.close();
		return re;
	}
//	========================book========================================
	public static List<BookVo>listBook(){
		SqlSession session = factory.openSession();
		List<BookVo>list = session.selectList("book.select");
		session.close();
		return list;
	}
	public static int insertBook(BookVo b) {
		int re= -1;
		SqlSession session = factory.openSession(true);
		re=session.insert("book.insert",b);
		session.close();
		return re;
	}
	public static int deleteBook(BookVo b) {
		int re= -1;
		SqlSession session = factory.openSession(true);
		re=session.insert("book.delete",b);
		session.close();
		return re;
	}
	public static int updateBook(BookVo b) {
		int re= -1;
		SqlSession session = factory.openSession(true);
		re=session.insert("book.update",b);
		session.close();
		return re;
	}
}
