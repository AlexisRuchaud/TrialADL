package com.alma.csa.hadl.m2.component;

import java.util.HashMap;
import java.util.Map;

import fr.univnantes.alma.hadl.m2.service.ProvidedService;
import fr.univnantes.alma.hadl.m2.service.RequiredService;

public abstract class Component {
	
	protected Map<String, ProvidedService> providedServices = new HashMap<String, ProvidedService>();
	protected Map<String, RequiredService> requiredServices = new HashMap<String, RequiredService>();
	protected Map<String, RequiredPort> requiredPort = new HashMap<String, RequiredPort>();
	protected Map<String, ProvidedPort> providedPort = new HashMap<String, ProvidedPort>();
	
}
