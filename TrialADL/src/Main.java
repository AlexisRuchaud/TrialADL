
import M1.Components.*;
import M1.Connectors.*;
import M1.GLUE.*;
import M1.Ports.*;
import M1.Components.*;

public class Main {

	private static Client client = new Client("client");
	private static ConnectionManager connectionManager = new ConnectionManager("connectionManager");
	private static Database databse = new Database("database");
	private static Server server = new Server("server");
	private static ClearanceRequest clearanceRequest = new ClearanceRequest("clearanceRequest");
	private static RPC rpc = new RPC("rpc");
	private static SecurityQuery securityQuery = new SecurityQuery("securityQuery");
	private static SQLQuery sqlQuery = new SQLQuery("sqlQuery");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
