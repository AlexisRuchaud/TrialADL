package M2.Connexion;

import java.util.Observable;

public class BindingFrom extends Binding {

	public BindingFrom(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable o, Object arg) {
		this.setChanged();
		this.notifyObservers(arg);
		
	}

}
