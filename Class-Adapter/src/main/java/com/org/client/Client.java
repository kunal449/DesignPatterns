package com.org.client;

import com.org.adapter.Socket;
import com.org.adapter.Adapter;

/*
 * Client has 2 pin socket not working with Original ThreePin-Plug.
 * Our adapter comes to rescue......see the magic
 */
public class Client {
	private Socket sock;
	public String getPower() {
		sock = new Adapter();
		return sock.getInput();
	}
	public static void main(String[] args) {
		Client c = new Client();
		System.out.println("Client using adapter to power on .... "+c.getPower());
				
	}

}
