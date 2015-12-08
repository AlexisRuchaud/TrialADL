package M1.Components;
import M1.Ports.*;
import M1.Services.ServerReceiveRequestService;
import M1.Services.ServerSendRequestService;

public class Server  extends M2.component.Configuration {
	public ServerReceiveRequestPort portServerOut;
	public ServerSendRequestPort portServerIn;
	public ServerReceiveRequestService serviceServerOut;
	public ServerSendRequestService serviceServerIn;
	public Server(String name) {
		super(name);
		portServerOut = new ServerReceiveRequestPort("portServerOut",this);
		portServerIn = new ServerSendRequestPort("portServerIn",this);
		serviceServerOut = new ServerReceiveRequestService("serviceServiceOut",this);
		serviceServerIn = new ServerSendRequestService("serviceServerIn",this);
		portServerOut.addService(serviceServerOut);
		portServerIn.addService(serviceServerIn);
		serviceServerOut.addPort(portServerOut);
		serviceServerIn.addPort(portServerIn);
		// TODO Auto-generated constructor stub
	}
	
	public void sendRequest(Object o){
		System.out.println("Arrivé sur le serveur");
		serviceServerOut.sendRequest(o);
	}
}
