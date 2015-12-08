package M2.component;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import M2.service.Interface;
import M2.service.Service;

public class Port extends Interface implements Observer {
	private ArrayList<Service> listService;
	public Port(String name,Component c) {
		super(name,c);
		listService = new ArrayList<Service>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable o, Object arg) {
		c.sendRequest(arg);
		
	}

	public ArrayList<Service> getListService() {
		return listService;
	}

	public void setListService(ArrayList<Service> listService) {
		this.listService = listService;
	}
	
	public void addService(Service s){
		this.listService.add(s);
	}
}
