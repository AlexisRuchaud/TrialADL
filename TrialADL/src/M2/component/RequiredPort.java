package M2.component;

import java.util.Observable;
import java.util.Observer;

import M2.service.Service;

public class RequiredPort extends Port implements Observer {

	public RequiredPort(String name,Component c) {
		super(name,c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable o, Object arg) {
		this.sendRequest(arg);
	}
	
	public void sendRequest(Object o){
		System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
		this.c.sendRequest(o);
	}

}
