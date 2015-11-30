package M1.Components;
import M1.Ports.*;


public class Database extends M2.component.SimpleComponent {

	private static SecurityManagementIn securityManagementIn = new SecurityManagementIn("securityManagementIn");
	private static SecurityManagementOut securityManagementOut = new SecurityManagementOut("securityManagementOut");
	private static QueryIn queryIn = new QueryIn("queryIn");
	private static QueryOut queryOut = new QueryOut("queryOut");
	
	public Database(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
