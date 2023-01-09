package com.stomp.example.demo.dto;

public class ResponseMessage 
{
	private String content;
	
	public ResponseMessage() 
	{
		super();
	}

	public ResponseMessage(String content) 
	{
		super();
		this.content = content;
	}

	public String getContent() 
	{
		return content;
	}

	public void setContent(String content) 
	{
		this.content = content;
	}
}
