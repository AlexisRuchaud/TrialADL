package com.alma.csa.hadl.m2.component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
}
