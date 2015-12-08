package M2.Connexion;

import java.util.Observable;
import java.util.Observer;

public class BindingTo extends Binding implements Observer {

	public BindingTo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Passage par : "+ this.name + ". Message : "+ arg.toString());
		this.setChanged();
		this.notifyObservers(arg);
		
	}

}
