package M1.Components;
import M1.Ports.*;
import M1.Services.ClientReceiveRequestService;
import M1.Services.ClientSendRequestService;

public class Client extends M2.component.SimpleComponent {
	
	public ClientReceiveRequestPort portClientOut;
	public ClientSendRequestPort portClientIn;
	public ClientReceiveRequestService serviceClientOut;
	public ClientSendRequestService serviceClientIn;
	public Client(String name) {
		super(name);
		portClientOut = new ClientReceiveRequestPort("portClientOut",this);
		portClientIn = new ClientSendRequestPort("portClientIn",this);
		serviceClientOut  = new ClientReceiveRequestService("serviceClientOut",this);
		serviceClientIn  = new ClientSendRequestService("serviceClientIn",this);
		portClientOut.addService(serviceClientOut);
		portClientIn.addService(serviceClientIn);
		serviceClientOut.addPort(portClientOut);
		serviceClientIn.addPort(portClientIn);
		// TODO Auto-generated constructor stub
	}
	public void sendRequest(Object o){
		System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
		serviceClientOut.sendRequest(o);
	}
}
