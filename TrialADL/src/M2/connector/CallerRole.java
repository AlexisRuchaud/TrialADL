package M2.connector;

public class CallerRole implements Role {

	private String name;
	public CallerRole(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String n) {
		this.name = n;
		
	}

}
