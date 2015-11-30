package M1.Components;
import M1.Ports.*;

public class Client extends M2.component.SimpleComponent {


	private static ClientSendRequestIn sendRequest = new ClientSendRequestIn("sendRequest");
	private static ClientReceiveRequestOut receiveRequest = new ClientReceiveRequestOut("receiveRequest");
	
	
	public Client(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
