package M2.component;

import java.util.ArrayList;

public class Configuration extends Component {

	protected ArrayList<Component> components;
	
	public Configuration(String name) {
		super(name);
		components = new ArrayList<Component>();
		// TODO Auto-generated constructor stub
	}

	public void addComponent(Component c){
		components.add(c);
	}
	
	public ArrayList<Component> getComponents(){
		return components;
	}
	
}
