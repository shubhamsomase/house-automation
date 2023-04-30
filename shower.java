package collectionproject;

public class shower implements device {
	String	divname;
	String name;

	public shower(String divname, String name) {
		this.divname = divname;
		this.name = name;
	}

	public String getDivname() {
		return divname;
	}

	public void setDivname(String divname) {
		this.divname = divname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean on() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean off() {
		// TODO Auto-generated method stub
		return false;
	}

	                              
	
}
