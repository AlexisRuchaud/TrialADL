package M2.connector;

import java.util.Observable;

public class CalledRole extends Role {

	public CalledRole(String name, Connector c) {
		super(name,c);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void sendRequest(Object o) {
		System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
		this.setChanged();
		this.notifyObservers(o);
	}


}
