package com.java2novice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.beans.Article;
import com.java2novice.manager.ColorManager;

public class DiConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext.xml");
		ColorManager cm = ctx.getBean("colorManager",ColorManager.class);
		cm.printColor();
		
		Article article = ctx.getBean("articleBean",Article.class);
		System.out.println(article.toString());
	}

}
