package M1.Ports;

import M2.component.Component;
import M2.component.RequiredPort;

public class ServerReceiveRequestPort extends RequiredPort {

	public ServerReceiveRequestPort(String name, Component c) {
		super(name, c);
		// TODO Auto-generated constructor stub
	}
	public void sendRequest(Object o){
		System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
		this.c.sendRequest(o);
	}

}
