package M1.Connectors;

import M1.Roles.*;

public class RPC extends M2.connector.Connector {
	
	
	public rpcCalled rpcCalled;
	public rpcCaller rpcCaller;
	public rpcCalled calledRpc;
	public rpcCaller callerRpc;
	public boolean pass;

	public RPC(String name) {
		super(name);
		rpcCalled = new rpcCalled("rpcCalled",this);
		rpcCaller = new rpcCaller("rpcCaller",this);
		calledRpc = new rpcCalled("calledRpc",this);
		callerRpc = new rpcCaller("callerRpc",this);
		this.pass = false;
		// TODO Auto-generated constructor stub
	}
	public void sendRequest(Object o){
		if(!pass){
			System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
			pass = true;
			rpcCalled.sendRequest(o);
		}else{
			System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
			calledRpc.sendRequest(o);
		}
		
	}

}
