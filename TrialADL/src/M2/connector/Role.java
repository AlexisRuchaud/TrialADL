package M2.connector;

import java.util.Observable;
import java.util.Observer;

public abstract class Role extends Observable{
		protected String name;
		protected Connector connector;
		public Role(String name,Connector c){
			this.name = name;
			this.connector = c;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String n) {
			this.name = n;
		}
		public void sendRequest(Object o){
			System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
		}
}


