package collectionproject;

public class tv implements device {

String	divname;
String name;

	public tv(String divname, String name) {
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
		 System.out.println("tv is on");
		return true;
	}

	public tv() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean off() {
		// TODO Auto-generated method stub
		System.out.println("tv is off");
		return true;
	}
  
	
}
