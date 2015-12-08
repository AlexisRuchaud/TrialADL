package M0;
import M1.Connectors.*;
import M1.GLUE.*;
import M1.Ports.*;
import M1.Services.*;
import M1.Roles.*;
import M1.Components.*;
import M1.Components.SecurityManager;
import M2.component.*;
import M2.connector.*;
import M2.other.*;
import M2.service.*;
public class Main {

	public static void main(String[] args) {

		// Composant Client
		Client client = new Client("Client");
		//Composant Server
		Server server = new Server("Server");
		
		//Composant ConnectionManager
		ConnectionManager connectionManager = new ConnectionManager("connectionManager",server);
		
		//Composant Database
		Database database = new Database("database");
			
		//Composant SecurityManager
		SecurityManager securityManager = new SecurityManager("securityManager");
			
		//Configuration Server
	
		server.addComponent(connectionManager);
		server.addComponent(database);
		server.addComponent(securityManager);
	
		//Configuration ClientServer
		Configuration ClientServer = new Configuration("ClientServer");
		ClientServer.addComponent(client);
		ClientServer.addComponent(server);
		
		//Connecteurs
		ClearanceRequest ClearanceRequest = new ClearanceRequest("ClearanceRequest");
		RPC rpc = new RPC("rpc");
		SecurityQuery SecurityQuery = new SecurityQuery("SecurityQuery");
		SQLQuery SQLQuery = new SQLQuery("SQLQuery");
		
		//Ajout des glues aux connecteurs

		ClearanceRequest.setGlue(new ClearanceRequestGLUE());
		rpc.setGlue(new RPCGLUE());
		SecurityQuery.setGlue(new SecurityQueryGLUE());
		SQLQuery.setGlue(new SQLQueryGLUE());
		
		//Ajout des connecteurs dans les configurations correspondantes et création des attachements
		server.addConnector(ClearanceRequest);
		//server.attach(connectionManager.portSecurityCheckOut, ClearanceRequest.ClearanceRequestCaller);
		server.attach(connectionManager.portSecurityCheckIn, ClearanceRequest.ClearanceRequestCalled);
		server.attach(securityManager.portSecurityAuthorizationOut, ClearanceRequest.ClearanceRequestCaller);
		//server.attach(securityManager.portSecurityAuthorizationIn, ClearanceRequest.ClearanceRequestCalled);
		
		server.addConnector(SecurityQuery);
		server.attach(database.portSecurityManagementOut, SecurityQuery.SecurityQueryCaller);
		//server.attach(database.portSecurityManagementIn, SecurityQuery.SecurityQueryCalled);
		//server.attach(securityManager.portCheckQueryOut, SecurityQuery.SecurityQueryCaller);
		server.attach(securityManager.portCheckQueryIn, SecurityQuery.SecurityQueryCalled);
		
		server.addConnector(SQLQuery);
		//server.attach(database.portQueryOut, SQLQuery.SQLQueryCaller);
		server.attach(database.portQueryIn,   SQLQuery.SQLQueryCalled);
		server.attach(connectionManager.portDBQueryOut,   SQLQuery.SQLQueryCaller);
		//server.attach(connectionManager.portDBQueryIn,   SQLQuery.SQLQueryCalled);
		
		
		ClientServer.addConnector(rpc);
		ClientServer.attach(client.portClientOut, rpc.rpcCaller);
		//ClientServer.attach(client.portClientIn, rpc.rpcCalled);
		//ClientServer.attach(server.portServerOut, rpc.rpcCaller);
		ClientServer.attach(server.portServerIn, rpc.rpcCalled);
		
		ClientServer.bind(server.portServerOut, connectionManager.externalSocket);
			
		
		
		client.sendRequest("Message");
	}

}
