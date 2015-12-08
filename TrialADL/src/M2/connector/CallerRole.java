package M2.connector;

import java.util.Observable;
import java.util.Observer;

public class CallerRole extends Role implements Observer {

	public CallerRole(String name,Connector c) {
		super(name,c);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void update(Observable o, Object arg) {
		this.sendRequest(arg);
	}

	public void sendRequest(Object o) {
		System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
		connector.sendRequest(o);
		
	}

}
