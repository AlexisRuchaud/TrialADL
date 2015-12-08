package M2.connector;

import java.util.ArrayList;

public abstract class Connector {
	
	
	protected ArrayList<CallerRole> callerRoles;
	protected ArrayList<CalledRole> calledRoles;
	protected Glue glue;
	protected String name;
	
	public Connector(String name){
		callerRoles = new ArrayList<CallerRole>();
		calledRoles = new ArrayList<CalledRole>();
		glue = new Glue();
		this.name = name;
	}
	
	public void addCallerRole(CallerRole c){
		callerRoles.add(c);
	}
	
	public void addCalledRole(CalledRole c){
		calledRoles.add(c);
	}
	
	public ArrayList<CallerRole> getCallerRoles(){
		return callerRoles;
	}
	
	public ArrayList<CalledRole> getCalledRoles(){
		return calledRoles;
	}

	public Glue getGlue() {
		return glue;
	}

	public void setGlue(Glue glue) {
		this.glue = glue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sendRequest(Object o){	
		System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
		for(CalledRole r : this.getCalledRoles()){
			r.sendRequest(o);
		}

	}
	
}
