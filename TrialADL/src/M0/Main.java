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
		client.addProvidedPort(new ClientReceiveRequestPort("portClientOut"));
		client.addRequiredPOrt(new ClientSendRequestPort("portClientIn"));
		client.addProvidedService(new ClientReceiveRequestService("serviceClientOut"));
		client.addRequiredService(new ClientSendRequestService("serviceClientIn"));
		
		//Composant ConnectionManager
		ConnectionManager connectionManager = new ConnectionManager("connectionManager");
		connectionManager.addProvidedPort(new SecurityCheckOut("portSecurityCheckOut"));
		connectionManager.addRequiredPOrt(new SecurityCheckIn("portSecurityCheckInt"));
		connectionManager.addProvidedService(new SecurityCheck_ServiceOut("serviceSecurityCheckOut"));
		connectionManager.addRequiredService(new SecurityCheck_ServiceIn("serviceSecurityCheckIn"));
		connectionManager.addProvidedPort(new DBQueryOut("portDBQueryOut"));
		connectionManager.addRequiredPOrt(new DBQueryIn("portDBQueryInt"));
		connectionManager.addProvidedService(new DBQuery_ServiceOut("serviceDBQueryOut"));
		connectionManager.addRequiredService(new DBQuery_ServiceIn("serviceDBQueryIn"));
		
		//Composant Database
		Database database = new Database("database");
		database.addProvidedPort(new QueryOut("portQueryOut"));
		database.addRequiredPOrt(new QueryIn("portQueryInt"));
		database.addProvidedService(new Query_ServiceOut("serviceQueryOut"));
		database.addRequiredService(new Query_ServiceIn("serviceQueryIn"));
		database.addProvidedPort(new SecurityManagementOut("portSecurityManagementOut"));
		database.addRequiredPOrt(new SecurityManagementIn("portSecurityManagementIn"));
		database.addProvidedService(new SecurityManagement_ServiceOut("serviceSecurityManagementOut"));
		database.addRequiredService(new SecurityManagement_ServiceIn("serviceSecurityManagementIn"));
		
		//Composant SecurityManager
		SecurityManager securityManager = new SecurityManager("securityManager");
		securityManager.addProvidedPort(new CheckQueryOut("portCheckQueryOut"));
		securityManager.addRequiredPOrt(new CheckQueryIn("portCheckQueryIn"));
		securityManager.addProvidedService(new CheckQuery_ServiceOut("serviceCheckQueryOut"));
		securityManager.addRequiredService(new CheckQuery_ServiceIn("serviceCheckQueryIn"));
		securityManager.addProvidedPort(new SecurityAuthorizationOut("portSecurityAuthorizationOut"));
		securityManager.addRequiredPOrt(new SecurityAuthorizationIn("portSecurityAuthorizationIn"));
		securityManager.addProvidedService(new SecurityAuthorization_ServiceOut("serviceSecurityAuthorizationOut"));
		securityManager.addRequiredService(new SecurityAuthorization_ServiceIn("serviceSecurityAuthorizationIn"));
		
		//Configuration Server
		Configuration server = new Configuration("Server");
		server.addComponent(connectionManager);
		server.addComponent(database);
		server.addComponent(securityManager);

		server.addProvidedPort(new ServerReceiveRequestPort("portServerOut"));
		server.addRequiredPOrt(new ServerSendRequestPort("portServerIn"));
		server.addProvidedService(new ServerReceiveRequestService("serviceServiceOut"));
		server.addRequiredService(new ServerSendRequestService("serviceServerIn"));
		
		//Configuration ClientServer
		Configuration ClientServer = new Configuration("ClientServer");
		ClientServer.addComponent(client);
		ClientServer.addComponent(server);
		
		//Connecteurs
		ClearanceRequest ClearanceRequest = new ClearanceRequest("ClearanceRequest");
		RPC rpc = new RPC("rpc");
		SecurityQuery SecurityQuery = new SecurityQuery("SecurityQuery");
		SQLQuery SQLQuery = new SQLQuery("SQLQuery");
		
		ClearanceRequest.setGlue(new ClearanceRequestGLUE());
		ClearanceRequest.addCalledRole(new CalledRole("ClearanceRequestCalled"));
		ClearanceRequest.addCallerRole(new CallerRole("ClearanceRequestCaller"));
		
		rpc.setGlue(new RPCGLUE());
		rpc.addCalledRole(new CalledRole("rpcCalled"));
		rpc.addCallerRole(new CallerRole("rpcCaller"));
		
		SecurityQuery.setGlue(new SecurityQueryGLUE());
		SecurityQuery.addCalledRole(new CalledRole("SecurityQueryCalled"));
		SecurityQuery.addCallerRole(new CallerRole("SecurityQueryCaller"));
		
		SQLQuery.setGlue(new SQLQueryGLUE());
		SQLQuery.addCalledRole(new CalledRole("SQLQueryCalled"));
		SQLQuery.addCallerRole(new CallerRole("SQLQueryCaller"));
		
		
		
	}

}
