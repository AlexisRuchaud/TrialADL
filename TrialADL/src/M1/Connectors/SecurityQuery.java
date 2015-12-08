package M1.Connectors;

import M1.GLUE.SecurityQueryGLUE;
import M1.Roles.RoleCalled;
import M1.Roles.RoleCaller;

public class SecurityQuery extends M2.connector.Connector {

	
	public RoleCalled SecurityQueryCalled;
	public RoleCaller SecurityQueryCaller;
	
	public SecurityQuery(String name) {
		super(name);
		SecurityQueryCalled = new RoleCalled("SecurityQueryCalled",this);
		 SecurityQueryCaller = new RoleCaller("SecurityQueryCaller",this);
		// TODO Auto-generated constructor stub
	}
	public void sendRequest(Object o){
		System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
		SecurityQueryCalled.sendRequest(o);
	}
}
