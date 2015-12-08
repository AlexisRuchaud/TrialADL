package M2.Connexion;

import java.util.Observable;
import java.util.Observer;

public abstract class Attachement extends Observable{
	protected String name;
	public Attachement(String name){
		this.name = name;
	}
}
