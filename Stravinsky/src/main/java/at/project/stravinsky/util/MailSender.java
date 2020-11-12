package at.project.stravinsky.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class MailSender {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendMail() {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom("");
		simpleMailMessage.setTo("");
		simpleMailMessage.setSubject("");
		simpleMailMessage.setText("test");
		javaMailSender.send(simpleMailMessage);
	}

}
