package M1.Components;
import M1.Ports.*;
import M1.Services.Query_ServiceIn;
import M1.Services.Query_ServiceOut;
import M1.Services.SecurityManagement_ServiceIn;
import M1.Services.SecurityManagement_ServiceOut;


public class Database extends M2.component.SimpleComponent {
	public QueryOut portQueryOut;
	public QueryIn portQueryIn;
	public Query_ServiceOut serviceQueryOut;
	public Query_ServiceIn serviceQueryIn;
	public SecurityManagementOut portSecurityManagementOut;
	public SecurityManagementIn portSecurityManagementIn ;
	public SecurityManagement_ServiceOut serviceSecurityManagementOut;
	public SecurityManagement_ServiceIn serviceSecurityManagementIn;
	public Database(String name) {
		super(name);
		portQueryOut = new QueryOut("portQueryOut",this);
		portQueryIn = new QueryIn("portQueryIn",this);
		serviceQueryOut = new Query_ServiceOut("serviceQueryOut",this);
		serviceQueryIn = new Query_ServiceIn("serviceQueryIn",this);
		portSecurityManagementOut= new SecurityManagementOut("portSecurityManagementOut",this);
		portSecurityManagementIn= new SecurityManagementIn("portSecurityManagementIn",this);
		serviceSecurityManagementOut= new SecurityManagement_ServiceOut("serviceSecurityManagementOut",this);
		serviceSecurityManagementIn= new SecurityManagement_ServiceIn("serviceSecurityManagementIn",this);
		portQueryOut.addService(serviceQueryOut);
		portQueryIn.addService(serviceQueryIn);
		portSecurityManagementOut.addService(serviceSecurityManagementOut);
		portSecurityManagementIn.addService(serviceSecurityManagementIn);
		serviceQueryOut.addPort(portQueryOut);
		serviceQueryIn.addPort(portQueryIn);
		serviceSecurityManagementOut.addPort(portSecurityManagementOut);
		serviceSecurityManagementIn.addPort(portSecurityManagementIn);
		
		// TODO Auto-generated constructor stub
	}
	public void sendRequest(Object o){
		System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
		
		 switch (o.toString()) {
         case "Bonjour":  o = "Veuillez vous conecter";
        	break;
         case "Michel":  o = "Bonjour Michel, comment allez vous";
         	break;
         case "Message":  o = "Renvoyez votre message";
      	break;
         case "Aurevoir":  o = "Aurevoir, vous allez nous manquer";
      	break;
     }
		serviceSecurityManagementOut.sendRequest(o);
		
	}

}
