package M2.component;

public class ProvidedPort extends Port{

	public ProvidedPort(String name,Component c) {
		super(name,c);
		// TODO Auto-generated constructor stub
	}
	public void sendRequest(Object o){
		System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
		this.setChanged();
		this.notifyObservers(o);
	}
}
