package M2.service;

import java.util.Observable;
import java.util.Observer;

import M2.component.Component;

public abstract class Interface extends Observable {
	protected String name;
	protected Component c;
	
	public Interface(String name,Component c){
		this.name = name;
		this.c= c;
	}
	public String getName(){
		return this.name;
	}
	public void sendRequest(Object o){
		System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
	}
}
