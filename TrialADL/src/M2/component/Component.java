package M2.component;

import java.util.ArrayList;

import M2.connector.CalledRole;
import M2.other.Constraint;
import M2.other.Property;

import M2.service.ProvidedService;
import M2.service.RequiredService;
import M2.service.Service;

public abstract class Component {
	
	
	protected ArrayList<ProvidedService> providedServices;
	protected ArrayList<RequiredService> requiredServices;
	protected ArrayList<RequiredPort> requiredPorts;
	protected ArrayList<ProvidedPort> providedPorts;
	protected ArrayList<Property> properties ;
	protected ArrayList<Constraint> constraints ;
	protected String name;
	
	public Component(String name){
		providedServices = new ArrayList<ProvidedService>();
		requiredServices = new ArrayList<RequiredService>();
		requiredPorts = new ArrayList<RequiredPort>();
		providedPorts = new ArrayList<ProvidedPort>();
		properties = new ArrayList<Property>();
		constraints = new ArrayList<Constraint>();
		this.name = name;
	}
	
	public void addProvidedService(ProvidedService p){
		providedServices.add(p);
	}
	
	public void addRequiredService(RequiredService r){
		requiredServices.add(r);
	}
	
	public void addProvidedPort(ProvidedPort p){
		providedPorts.add(p);
	}
	
	public void addRequiredPort(RequiredPort r){
		requiredPorts.add(r);
	}
	
	public void addProperty(Property p){
		properties.add(p);
	}
	
	public void addConstraint(Constraint c){
		constraints.add(c);
	}

	public ArrayList<ProvidedService> getProvidedServices() {
		return providedServices;
	}

	public ArrayList<RequiredService> getRequiredServices() {
		return requiredServices;
	}

	public ArrayList<RequiredPort> getRequiredPorts() {
		return requiredPorts;
	}

	public ArrayList<ProvidedPort> getProvidedPorts() {
		return providedPorts;
	}

	public ArrayList<Property> getProperties() {
		return properties;
	}

	public ArrayList<Constraint> getConstraints() {
		return constraints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sendRequest(Object o){
		/*
		if(this.name == "Server"){
			System.out.println("Arrivé au serveur");
			for(Port p :this.getProvidedPorts()){
				p.sendRequest("Retour");
			}
			for(Service s : this.getProvidedServices()){
				s.sendRequest("Retour");
			}
		}else{
			System.out.println("Passage par : "+ this.getName() + ". Message : "+ o.toString());
			for(Port p :this.getProvidedPorts()){
				p.sendRequest(o);
			}
			for(Service s : this.getProvidedServices()){
				s.sendRequest(o);
			}
		}
		*/
		
	}
	
}
