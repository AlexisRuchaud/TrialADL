package M1.Connectors;

import M1.GLUE.ClearanceRequestGLUE;
import M1.Roles.RoleCalled;
import M1.Roles.RoleCaller;

public class ClearanceRequest extends M2.connector.Connector {
	
	
	public RoleCalled ClearanceRequestCalled ;
	public RoleCaller ClearanceRequestCaller;

	public ClearanceRequest(String name) {
		super(name);
		ClearanceRequestCalled = new RoleCalled("ClearanceRequestCalled",this);
		ClearanceRequestCaller = new RoleCaller("ClearanceRequestCaller",this);
		// TODO Auto-generated constructor stub
	}
	public void sendRequest(Object o){
		System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
		ClearanceRequestCalled.sendRequest(o);
	}

}
