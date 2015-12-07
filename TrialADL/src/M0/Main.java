package M0;
import M1.Connectors.*;
import M1.GLUE.*;
import M1.Ports.*;
import M1.Services.*;
import M1.Roles.*;
import M1.Components.*;
import M2.component.*;
import M2.connector.*;
import M2.other.*;
import M2.service.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client("Client");
		client.addProvidedPort(new ClientReceiveRequestPort("portClientOut"));
		client.addRequiredPOrt(new ClientSendRequestPort("portClientIn"));
		client.addProvidedService(new ClientReceiveRequestService("serviceClientOut"));
		client.addRequiredService(new ClientSendRequestService("serviceClientIn"));
		
		Server server = new Server("Server");
		server.addProvidedPort(new ServerReceiveRequestPort("portServerOut"));
		server.addRequiredPOrt(new ServerSendRequestPort("portServerIn"));
		server.addProvidedService(new ServerReceiveRequestService("serviceServiceOut"));
		server.addRequiredService(new ServerSendRequestService("serviceServerIn"));
		
		Configuration ClientServer = new Configuration("ClientServer");
		ClientServer.addComponent(client);
		ClientServer.addComponent(server);
		
	}

}
