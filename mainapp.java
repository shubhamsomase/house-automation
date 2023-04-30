package collectionproject;
import java.util.*;
public class mainapp {
  public static void main(String str[])
  {
	  
  
	
	//ontv( dev);
	
	
	
	house h1=new house();
	  Rooms r1=new Rooms();
	 
	  addroom(h1);
	  adddevice1(h1);
	  h1.display();
	//  r1.display();
	  
  }
  public static void  ontv(device dev)
  {
	  
	  System.out.println("want to on tv press 1 for close 2" );
	  Scanner sc= new Scanner(System.in);
	  int choice=sc.nextInt();
	  if(choice==1)
	  {
		  dev.on();
	  }
	  else
	  {
		  dev.off();
	  }
	  
	  }
	

public static void  addroom(house h1)
{
	     h1.addroom1();
	
	  }
public static void  adddevice1(house h1)  
{
	  
   h1.adroomdevc();
	 
	  }
	
}
