package collectionproject;
import java.util.*;
public class house {
  List<Rooms> room=new ArrayList<Rooms>();
  public house()
  {
	  
  }
  public void addroom1()
  {
	  Scanner sc=new Scanner(System.in);
		System.out.println("enter  room  name in your house ");
		   System.out.println("1.kitchen");
			 System.out.println("2.bedroom");
			 System.out.println("3.living area ");
			 System.out.println("4.dining room ");
			 System.out.println("5.wash room ");
			 System.out.println("6.corridor");
			 
			 String choice1;
			 int choice;
			do {
		        	System.out.print("Enter choice number ");
		            choice = sc.nextInt();
		            if(choice<=6)
		            {
			            System.out.print("add room  name: ");
		            choice1 = sc.next();
		           
		            Rooms r1=new Rooms(choice1);
		            room.add(r1);
		            }
			 }
			while(choice<=6);
		        
	
  }
  public void adroomdevc()
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("add room  name to add sevice: ");
      String str = sc.next();
	 /* for(int i=0;i<room.size();i++)
	  {
		/*  Object o=room.get(i);
		  if(o instanceof Rooms)
		  {
			  if(str.equals(((Rooms)o).getRname()))
			  {
				  ((Rooms)o).adddevices();
				  break; 
			  }
		  }*/
		  System.out.println("hi");
	  //}
		  Iterator<Rooms> itr=room.iterator();
		  while(itr.hasNext())
		  {
			  Rooms r=itr.next();
			  if(str.equals(r.getRname()))
			  {
				  r.adddevices();
			  }
			
		  }
  
  }
  public void display()
  {
	  Iterator<Rooms> itr=room.iterator();
	  while(itr.hasNext())
	  {
		  Rooms r=itr.next();
		  System.out.println(r.getRname());
		
	  }
  }
}
