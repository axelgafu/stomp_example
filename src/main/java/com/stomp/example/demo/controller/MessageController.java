package com.stomp.example.demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.stomp.example.demo.dto.*;

@Controller
public class MessageController 
{
	@MessageMapping("/message")
	@SendTo("/topic/messages")
	public ResponseMessage getMessage(final Message message) throws InterruptedException
	{
		Thread.sleep(500);
		
		return new ResponseMessage(HtmlUtils.htmlEscape(message.getMessageContent()));
	}
}
