package com.capg.greetingapp.model;

public class Greeting {

	private long id;
	private String msg;

	public Greeting(long id, String msg) {
		this.id = id;
		this.msg = msg;
	}

	public long getID() {
		return id;
	}

	public String getMsg() {
		return  msg;
	}

}
