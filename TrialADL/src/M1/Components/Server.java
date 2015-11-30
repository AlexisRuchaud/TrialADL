package M1.Components;
import M1.Ports.*;

public class Server  extends M2.component.Configuration {

	private static ServerSendRequestIn serverSendRequestIn = new ServerSendRequestIn("serverSendRequestIn");
	private static ServerReceiveRequestOut serverReceiveRequestOut = new ServerReceiveRequestOut("serverReceiveRequestOut");
	

	public Server(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
