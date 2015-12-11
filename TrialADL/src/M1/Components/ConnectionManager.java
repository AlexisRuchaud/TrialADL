package M1.Components;
import M1.Ports.*;
import M1.Services.DBQuery_ServiceIn;
import M1.Services.DBQuery_ServiceOut;
import M1.Services.SecurityCheck_ServiceIn;
import M1.Services.SecurityCheck_ServiceOut;
import M2.component.Component;

public class ConnectionManager extends M2.component.SimpleComponent {
	
	public SecurityCheckOut portSecurityCheckOut;
	public SecurityCheckIn portSecurityCheckIn;
	public SecurityCheck_ServiceOut serviceSecurityCheckOut;;
	public SecurityCheck_ServiceIn serviceSecurityCheckIn;
	public DBQueryOut portDBQueryOut;
	public DBQueryIn portDBQueryIn;
	public DBQuery_ServiceOut serviceDBQueryOut;
	public DBQuery_ServiceIn serviceDBQueryIn;
	public ExternalSocket externalSocket;
	public Component parent;
	public boolean pass;
	public ConnectionManager(String name,Component parent) {
		super(name);
		portSecurityCheckOut = new SecurityCheckOut("portSecurityCheckOut",this);
		portSecurityCheckIn = new SecurityCheckIn("portSecurityCheckIn",this);
		serviceSecurityCheckOut = new SecurityCheck_ServiceOut("serviceSecurityCheckOut",this);
		serviceSecurityCheckIn = new SecurityCheck_ServiceIn("serviceSecurityCheckIn",this);
		portDBQueryOut = new DBQueryOut("portDBQueryOut",this);
		portDBQueryIn = new DBQueryIn("portDBQueryIn",this);
		serviceDBQueryOut = new DBQuery_ServiceOut("serviceDBQueryOut",this);
		serviceDBQueryIn =new DBQuery_ServiceIn("serviceDBQueryIn",this);
		externalSocket =new ExternalSocket("externalSocket",this);
		this.parent = parent;
		portSecurityCheckOut.addService(serviceSecurityCheckOut);
		portSecurityCheckIn.addService(serviceSecurityCheckIn);
		portDBQueryOut.addService(serviceDBQueryOut);
		portDBQueryIn.addService(serviceDBQueryIn);
		serviceSecurityCheckOut.addPort(portSecurityCheckOut);
		serviceSecurityCheckIn.addPort(portSecurityCheckIn);
		serviceDBQueryOut.addPort(portDBQueryOut);
		serviceDBQueryIn.addPort(portDBQueryIn);
		this.pass = false;
		// TODO Auto-generated constructor stub
	}
	public void sendRequest(Object o){
		if(!pass){
			System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
			pass = true;
			serviceDBQueryOut.sendRequest(o);
		}else{
			System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
			parent.sendRequest(o);
		}
	}
}
