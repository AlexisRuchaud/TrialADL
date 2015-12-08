package M1.Components;
import M1.Ports.*;
import M1.Services.CheckQuery_ServiceIn;
import M1.Services.CheckQuery_ServiceOut;
import M1.Services.SecurityAuthorization_ServiceIn;
import M1.Services.SecurityAuthorization_ServiceOut;

public class SecurityManager extends M2.component.SimpleComponent {
	public CheckQueryOut portCheckQueryOut;
	public CheckQueryIn portCheckQueryIn;
	public CheckQuery_ServiceOut serviceCheckQueryOut;
	public CheckQuery_ServiceIn serviceCheckQueryIn;
	public SecurityAuthorizationOut portSecurityAuthorizationOut;
	public SecurityAuthorizationIn portSecurityAuthorizationIn;
	public SecurityAuthorization_ServiceOut serviceSecurityAuthorizationOut;
	public SecurityAuthorization_ServiceIn serviceSecurityAuthorizationIn;
	public SecurityManager(String name) {
		super(name);
		portCheckQueryOut = new CheckQueryOut("portCheckQueryOut",this);
		portCheckQueryIn = new CheckQueryIn("portCheckQueryIn",this);
		serviceCheckQueryOut = new CheckQuery_ServiceOut("serviceCheckQueryOut",this);
		serviceCheckQueryIn = new CheckQuery_ServiceIn("serviceCheckQueryIn",this);
		portSecurityAuthorizationOut = new SecurityAuthorizationOut("portSecurityAuthorizationOut",this);
		portSecurityAuthorizationIn = new SecurityAuthorizationIn("portSecurityAuthorizationIn",this);
		serviceSecurityAuthorizationOut = new SecurityAuthorization_ServiceOut("serviceSecurityAuthorizationOut",this);
		serviceSecurityAuthorizationIn = new SecurityAuthorization_ServiceIn("serviceSecurityAuthorizationIn",this);
		portCheckQueryOut.addService(serviceCheckQueryOut);
		portCheckQueryIn.addService(serviceCheckQueryIn);
		portSecurityAuthorizationOut.addService(serviceSecurityAuthorizationOut);
		portSecurityAuthorizationIn.addService(serviceSecurityAuthorizationIn);
		serviceCheckQueryOut.addPort(portCheckQueryOut);
		serviceCheckQueryIn.addPort(portCheckQueryIn);
		serviceSecurityAuthorizationOut.addPort(portSecurityAuthorizationOut);
		serviceSecurityAuthorizationIn.addPort(portSecurityAuthorizationIn);
		// TODO Auto-generated constructor stub
	}
	public void sendRequest(Object o){
		System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
		serviceSecurityAuthorizationOut.sendRequest(o);
	}
}
