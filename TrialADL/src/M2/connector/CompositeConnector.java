package M2.connector;

import java.util.ArrayList;

public class CompositeConnector extends Connector {

	private ArrayList<Connector> connectors;
	public CompositeConnector(String name) {
		super(name);
		connectors = new ArrayList<Connector>();
		// TODO Auto-generated constructor stub
	}

}
