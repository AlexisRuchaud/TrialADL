package M2.service;

import java.util.ArrayList;

import M2.component.Component;
import M2.component.Port;

public abstract class Service extends Interface {
	private ArrayList<Port> listPort;
	public Service(String name,Component c) {
		super(name,c);
		listPort = new ArrayList<Port>();
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Port> getListPort() {
		return listPort;
	}
	public void setListPort(ArrayList<Port> listPort) {
		this.listPort = listPort;
	}
	public void addPort(Port p){
		this.listPort.add(p);
	}
	public void sendRequest(Object o){
		System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
		for(Port p : listPort){
			p.sendRequest(o);
		}
	}
}
