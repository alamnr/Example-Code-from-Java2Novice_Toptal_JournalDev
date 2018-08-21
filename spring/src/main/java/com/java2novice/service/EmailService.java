package com.java2novice.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.java2novice.spring.MailDemo;

@Service("emailService")
public class EmailService {
	
	static  final Logger logger =  Logger.getLogger(MailDemo.class);
	
	@Autowired
	private MailSender mailSender;
	
    @Autowired
    @Qualifier("mailSenderAttachment")
    private JavaMailSender mailSenderAttachment;
	
	public void sendMail(String to,String from, String sub, String mailBody){
		
		try {
			SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
			simpleMailMessage.setTo(to);
			simpleMailMessage.setFrom(from);
			simpleMailMessage.setSubject(sub);
			simpleMailMessage.setText(mailBody);
			mailSender.send(simpleMailMessage);
		} catch (MailException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage(), e);
		}
		
	}
	
public void sendMailWithAttachment(String to,String from, String sub, String mailBody,byte[] content){
		
	MimeMessage message = mailSenderAttachment.createMimeMessage();
    try {
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(from);
        helper.setTo(to);
        helper.setSubject(sub);
        helper.setText(mailBody);
        helper.addAttachment("MyTestFile.txt", new ByteArrayResource(content));
        mailSenderAttachment.send(message);
    } catch (MessagingException e) {
        // TODO Auto-generated catch block
    	logger.error(e.getMessage(), e);
    }
    catch (Exception e) {
        // TODO Auto-generated catch block
    	logger.error(e.getMessage(), e);
    }
		
	}

}
