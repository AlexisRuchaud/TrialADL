package M2.Connexion;
import java.util.Observable;
import java.util.Observer;

public class AttachementTo extends Attachement implements Observer{

	public AttachementTo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public String getName(){
		return this.name;
	}
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Passage par : "+ this.getName() + ". Message : "+ arg.toString());
		this.setChanged();
		this.notifyObservers(arg);
		
	}
	

}
