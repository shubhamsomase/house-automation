package collectionproject;
import java.util.*;
public class Rooms {
 String rname;
 
 List<device>device1=new ArrayList<device>();;
 
public Rooms()
{
	
}


public String getRname() {
	return rname;
}

public void setRname(String rname) {
	this.rname = rname;
}

public Rooms(String rname) {
	this.rname = rname;
	
}


public List<device> getDevice1() {
	return device1;
}

public void setDevice1(List<device> device1) {
	this.device1 = device1;
}

public void adddevices()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter  device  name ");
	 System.out.println("hi");
		 System.out.println("1.tv ");
		 System.out.println("2.ac ");
		 System.out.println("3.lights ");
		 System.out.println("4.shower ");
		 String choice1;
		 int choice;
	        do {
	            System.out.print("Enter choice  ");
	            choice = sc.nextInt();
	            System.out.print("add entered  device name: ");
	            choice1 = sc.next();
	            if(choice==1)
	            {
	            	device dev=new tv("tv",choice1);
	            	  device1.add(dev);
	            }
	            else if(choice==2)
	            {
	            	device dev1=new ac("ac",choice1);
	            	  device1.add(dev1);
	            }
	            else if(choice==3)
	            {
	            	device dev2=new lights("light",choice1);
	            	  device1.add(dev2);
	            }
	            else if(choice==4)
	            {
	            	device dev3=new ac("shower",choice1);
	            	  device1.add(dev3);
	            }
	            else
	            {
	            	 System.out.println("invalid input ");
	            }
	            
	            
	            
	        }while(choice < 1 || choice > 4);
	        
	
	sc.close();
	  
	 
}

 
}
