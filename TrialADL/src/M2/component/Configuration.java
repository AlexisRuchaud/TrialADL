package M2.component;

import java.util.ArrayList;
import java.util.Observer;

import M1.Roles.RoleCaller;
import M2.Connexion.Attachement;
import M2.Connexion.AttachementFrom;
import M2.Connexion.AttachementTo;
import M2.Connexion.Binding;
import M2.Connexion.BindingTo;
import M2.connector.CallerRole;
import M2.connector.Connector;
import M2.connector.Role;

public class Configuration extends Component {

	protected ArrayList<Component> components;
	protected ArrayList<Connector> connectors;
	protected ArrayList<Attachement> attachements;
	protected ArrayList<Binding> bindings;
	
	
	public Configuration(String name) {
		super(name);
		components = new ArrayList<Component>();
		connectors = new ArrayList<Connector>();
		attachements = new ArrayList<Attachement>();
		bindings = new ArrayList<Binding>();
		// TODO Auto-generated constructor stub
	}

	public void addComponent(Component c){
		components.add(c);
	}
	
	public void addConnector(Connector c){
		connectors.add(c);
	}
	
	public ArrayList<Component> getComponents(){
		return components;
	}
	
	public ArrayList<Connector> getConnectors(){
		return connectors;
	}
	
	public void attach(Port p, Role r){
		if(p instanceof ProvidedPort){
			AttachementTo a = new AttachementTo("Attachement : "+ p.getName()+" To "+r.getName());
			p.addObserver(a);
			a.addObserver((RoleCaller)r);
			attachements.add(a);
		}else{
			AttachementTo a = new  AttachementTo("Attachement : "+r.getName()+" To "+p.getName());
			r.addObserver(a);
			a.addObserver((RequiredPort)p);
			attachements.add(a);
		}
	}
	
	public void bind(Port p1, Port p2){
		//if(p1 instanceof RequiredPort){
			BindingTo b = new BindingTo("Binding : " +p1.getName()+" To "+p2.getName());
			p1.addObserver(b);
			b.addObserver(p2);
			bindings.add(b);
		//}
	}
	
}
