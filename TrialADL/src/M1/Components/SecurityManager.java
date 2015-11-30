package M1.Components;
import M1.Ports.*;

public class SecurityManager extends M2.component.SimpleComponent {

	private static CheckQueryIn checkQueryIn = new CheckQueryIn("checkQueryIn");
	private static CheckQueryOut checkQueryOut = new CheckQueryOut("checkQueryOut");
	private static SecurityAuthorizationIn securityAuthorizationIn = new SecurityAuthorizationIn("securityAuthorizationIn");
	private static SecurityAuthorizationOut securityAuthorizationOut = new SecurityAuthorizationOut("securityAuthorizationOut");

	public SecurityManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
