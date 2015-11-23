package com.alma.csa.hadl.m2.component;

import java.util.ArrayList;

import com.alma.csa.hadl.m2.other.Constraint;
import com.alma.csa.hadl.m2.other.Property;

import fr.univnantes.alma.hadl.m2.service.ProvidedService;
import fr.univnantes.alma.hadl.m2.service.RequiredService;

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
	
	public void addRequiredPOrt(RequiredPort r){
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
	
}
