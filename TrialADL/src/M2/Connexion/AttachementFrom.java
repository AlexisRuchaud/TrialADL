package M2.Connexion;

import java.util.Observable;
import java.util.Observer;

public class AttachementFrom extends Attachement {

	public AttachementFrom(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void update(Observable o, Object arg) {
		this.setChanged();
		this.notifyObservers(arg);
	}


}
