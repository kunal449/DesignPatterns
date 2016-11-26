package com.org.adapter;

import com.thirdparty.Plug;

/*
 * This is CLASS-level-ADAPTATION of original class Socket --> see 'extends ThreePinPlug'
 * This is an 'is-a' relationship. 
 */
public class Adapter extends Plug implements Socket{

	@Override
	public String getInput() {
		String input = super.getPlug();
		input = input+" converted to 2 pin";
		return input;
	}

}
