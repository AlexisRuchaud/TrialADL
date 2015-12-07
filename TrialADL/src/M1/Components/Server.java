package M1.Components;
import M1.Ports.*;

public class Server  extends M2.component.Configuration {

	private static ServerSendRequestPort serverSendRequestIn = new ServerSendRequestPort("serverSendRequestIn");
	private static ServerReceiveRequestPort serverReceiveRequestOut = new ServerReceiveRequestPort("serverReceiveRequestOut");
	

	public Server(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
