package com.thirdparty;


/*
 * This is a third party class written by .... i donno....in 1970s :P. 
 * This plug has 3-pins
 */
public class Plug {

	private String specification;
	
	public String getPlug(){
		return this.specification;
	}
	public Plug(){
		this.specification = "3-pin";
	}
}
