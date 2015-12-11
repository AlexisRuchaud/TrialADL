package M1.Components;
import M1.Ports.*;
import M1.Services.ClientReceiveRequestService;
import M1.Services.ClientSendRequestService;

public class Client extends M2.component.SimpleComponent {
	
	public ClientReceiveRequestPort portClientIn;
	public ClientSendRequestPort portClientOut;
	public ClientReceiveRequestService serviceClientIn;
	public ClientSendRequestService serviceClientOut;
	public boolean pass;
	public Client(String name) {
		super(name);
		portClientIn = new ClientReceiveRequestPort("portClientIn",this);
		portClientOut = new ClientSendRequestPort("portClientOut",this);
		serviceClientIn  = new ClientReceiveRequestService("serviceClientIn",this);
		serviceClientOut  = new ClientSendRequestService("serviceClientOut",this);
		portClientOut.addService(serviceClientOut);
		portClientIn.addService(serviceClientIn);
		serviceClientOut.addPort(portClientOut);
		serviceClientIn.addPort(portClientIn);
		this.pass = false;
		// TODO Auto-generated constructor stub
	}
	public void sendRequest(Object o){
		if(!pass){
			System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
			pass = true;
			serviceClientOut.sendRequest(o);
		}else{
			System.out.println("Arrivé sur : "+ this.getName() + ". Message : "+ o.toString());
		}
		
	}
}
