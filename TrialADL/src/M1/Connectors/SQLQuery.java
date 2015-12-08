package M1.Connectors;

import M1.GLUE.SQLQueryGLUE;
import M1.Roles.RoleCalled;
import M1.Roles.RoleCaller;

public class SQLQuery extends M2.connector.Connector {
	
	
	public RoleCalled SQLQueryCalled;
	public RoleCaller SQLQueryCaller;
	

	public SQLQuery(String name) {
		super(name);
		SQLQueryCalled = new RoleCalled("SQLQueryCalled",this);
		SQLQueryCaller = new RoleCaller("SQLQueryCaller",this);
		// TODO Auto-generated constructor stub
	}
	public void sendRequest(Object o){
		System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
		SQLQueryCalled.sendRequest(o);
	}

}
