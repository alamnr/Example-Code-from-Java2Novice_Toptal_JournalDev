package com.java2novice.spring;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.service.EmailService;

public class MailDemo {
	
	static  final Logger  logger = Logger.getLogger(MailDemo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("mail.xml");
		EmailService emailService = (EmailService) context.getBean("emailService");
		String toAddr = "java2novice@gmail.com";
		String fromAddr = "javauser@gmail.com";
		String subject = "My Test Mail";
		String body = "Test mail body";
		emailService.sendMail(toAddr, fromAddr, subject, body);
		
		
		InputStream is = null;
		StringBuilder sb = new StringBuilder();
		
		try {
            is = new FileInputStream(new File("/Users/ngootooru/test.txt"));
            byte[] tmp = new byte[4*1024];
            int size = 0;
            while((size = is.read(tmp)) != -1){
                sb.append(new String(tmp, 0, size));
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            logger.error(e.getMessage(),e);
        }
        emailService.sendMailWithAttachment(toAddr, fromAddr, subject, body, sb.toString().getBytes());

	}

}
