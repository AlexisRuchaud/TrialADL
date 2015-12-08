package M2.Connexion;
import java.util.Observable;
import java.util.Observer;

public abstract class Binding extends Observable implements Observer {
	protected String name;
	public Binding(String name){
		this.name = name;
	}
}
