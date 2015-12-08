package M1.Connectors;

import M1.GLUE.RPCGLUE;
import M1.Roles.RoleCalled;
import M1.Roles.RoleCaller;

public class RPC extends M2.connector.Connector {
	
	
	public RoleCalled rpcCalled;
	public RoleCaller rpcCaller;


	public RPC(String name) {
		super(name);
		rpcCalled = new RoleCalled("rpcCalled",this);
		rpcCaller = new RoleCaller("rpcCaller",this);
		// TODO Auto-generated constructor stub
	}
	public void sendRequest(Object o){
		System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
		rpcCalled.sendRequest(o);
	}

}
