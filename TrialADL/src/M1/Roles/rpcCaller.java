package M1.Roles;

import java.util.Observable;

import M2.connector.CallerRole;
import M2.connector.Connector;

public class rpcCaller extends CallerRole {
	public boolean pass;
	public rpcCaller(String name, Connector c) {
		super(name, c);
		this.pass = false;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void update(Observable o, Object arg) {
		if(!pass)
		 this.sendRequest(arg);
	}

}
