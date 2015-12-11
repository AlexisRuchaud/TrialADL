package M1.Components;
import M1.Ports.*;
import M1.Services.ServerReceiveRequestService;
import M1.Services.ServerSendRequestService;

public class Server  extends M2.component.Configuration {
	public ServerReceiveRequestPort portServerIn;
	public ServerSendRequestPort portServerOut;
	public ServerReceiveRequestService serviceServerIn;
	public ServerSendRequestService serviceServerOut;
	public ServerSendBinding portSendBinding;
	public boolean pass;
	public Server(String name) {
		super(name);
		portServerIn = new ServerReceiveRequestPort("portServerIn",this);
		portServerOut = new ServerSendRequestPort("portServerOut",this);
		portSendBinding = new ServerSendBinding("portSendBinding",this);
		serviceServerIn = new ServerReceiveRequestService("serviceServerIn",this);
		serviceServerOut = new ServerSendRequestService("serviceServerOut",this);
		portServerOut.addService(serviceServerOut);
		portServerIn.addService(serviceServerIn);
		serviceServerOut.addPort(portServerOut);
		serviceServerIn.addPort(portServerIn);
		this.pass = false;
		// TODO Auto-generated constructor stub
	}
	
	public void sendRequest(Object o){
		if(pass){
			System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
			this.pass = false;
			serviceServerOut.sendRequest(o);
		}else{
			System.out.println("Passage par: "+ this.getName() + ". Message : "+ o.toString());
			this.pass = true;
			portSendBinding.sendRequest(o);
		}
		
	}
	public boolean getPass(){
		return this.pass;
	}
	
}
