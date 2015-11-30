package M1.Components;
import M1.Ports.*;

public class ConnectionManager extends M2.component.SimpleComponent {

	private static ExternalSocket externalSocket = new ExternalSocket("externalSocket");
	private static SecurityCheckIn securityCheckIn = new SecurityCheckIn("securityCheckIn");
	private static SecurityCheckOut securityCheckOut = new SecurityCheckOut("securityCheckOut");
	private static DBQueryIn dbQueryIn = new DBQueryIn("dbQueryIn");
	private static DBQueryOut dbQueryOut = new DBQueryOut("dbQueryOut");

	public ConnectionManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
