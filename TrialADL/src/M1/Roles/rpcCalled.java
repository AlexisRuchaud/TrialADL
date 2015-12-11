package M1.Roles;

import M2.connector.CalledRole;
import M2.connector.Connector;

public class rpcCalled extends CalledRole {

	public boolean pass;
	public rpcCalled(String name, Connector c) {
		super(name, c);
		this.pass = false;
		// TODO Auto-generated constructor stub
	}
	
	public void sendRequest(Object o) {
		if(!pass){
			pass = true;
			System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
			this.setChanged();
			this.notifyObservers(o);
		}else{
			System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
		}
		
	}

}
