package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DbManager;
import com.example.demo.vo.BookVo;
//import com.thoughtworks.xstream.XStream;

@RestController
public class BookController {
	
	@RequestMapping("/updateBook")
	public String updateBook(String oper, BookVo b) {
		String str="";
		System.out.println("oper:"+oper);
		
		if(oper.equals("add"))
		{	
			DbManager.insertBook(b);
		}else if(oper.equals("edit")) {
			DbManager.updateBook(b);
		}else if(oper.equals("del")) {
			DbManager.deleteBook(b);
		}	
		return str;
	}
	
	
	
   @RequestMapping(value="/getBook", produces="application/xml; charset=utf-8")
   public String getBook() {
      String str = "";
   
      str += "<rows>";
      str += "<page>1</page>";
      str += "<total>10</total>";
      str += "<records>15</records>";
      for(BookVo b : DbManager.listBook()) {
         str += "<row>";
         str += "<cell>" + b.getBookno() + "</cell>";
         str += "<cell>" + b.getBookname() + "</cell>";
         str += "<cell>" + b.getPublisher() + "</cell>";
         str += "<cell>" + b.getPrice() + "</cell>";
         str += "</row>";
      }
      str += "</rows>";

      return str;
   }
}