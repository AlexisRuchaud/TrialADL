package M2.connector;

public class CalledRole implements Role {
	private String name;
	public CalledRole(String name) {
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
		// TODO Auto-generated method stub
		this.name = n;
	}

}
