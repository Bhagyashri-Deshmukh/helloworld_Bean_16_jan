package com.justcodeit.helloworld_Bean_16_jan.pojo;

public class HelloWorld {

	private Integer id;
	private String helloMessage;
	private String welcomeMessage;

	public HelloWorld() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HelloWorld(Integer id, String helloMessage, String welcomeMessage) {
		super();
		this.id = id;
		this.helloMessage = helloMessage;
		this.welcomeMessage = welcomeMessage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHelloMessage() {
		return helloMessage;
	}

	public void setHelloMessage(String helloMessage) {
		this.helloMessage = helloMessage;
	}

	public String getWelcomeMessage() {
		return welcomeMessage;
	}

	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}

}
