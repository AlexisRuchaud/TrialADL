package M1.Components;
import M1.Ports.*;

public class Client extends M2.component.SimpleComponent {


	private static ClientSendRequestPort sendRequest = new ClientSendRequestPort("sendRequest");
	private static ClientReceiveRequestPort receiveRequest = new ClientReceiveRequestPort("receiveRequest");
	
	
	public Client(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
