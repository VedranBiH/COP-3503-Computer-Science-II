import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/*
Assignment 4
Author:Vedran Pehlivanovic
Date: 10/28/2013 
COP3503
*/

	   
public class n00888869 {
	
	   public static void main(String[] args) throws FileNotFoundException{
		   ArrayList<Vehicle> vehicleDataTypes = new ArrayList<Vehicle>();//Creae an arraylist of vehicles
	      
	      java.io.File file = new java.io.File(args[0]);//Read the data from the file
	      Scanner input = new Scanner(file);
	      String[] data = new String[10];
	   
	      while (input.hasNext()){//Assign data into variables
	         String lineType = input.nextLine();
	         switch (lineType){//use switch statments to control type of objects
	         case "vehicle":
	          for ( int i = 0; i < 4 ; i++){
	            data[i] = input.nextLine();
	           }
	          
	         Vehicle vehicleType = new Vehicle (data[0], data[1], data[2], data[3]);
	         
	         vehicleDataTypes.add(vehicleType);
	            break;
	         case "car":
	            for(int i = 0; i < 6; i++){
	               data [i] = input.nextLine();
	              }
	            
	              Car carType = new Car (data[0], data[1], data[2],data[3],
	              Boolean.parseBoolean (data[4]), data[5]);
	              
	              vehicleDataTypes.add(carType);
	              
	            break;
	            
	          case "american car":
	            for (int i = 0; i < 8; i++){
	               data [i] = input.nextLine();
	              }
	              AmericanCar AmerCarType = new AmericanCar ( data[0], data[1], data[2],
	              data[3], Boolean.parseBoolean (data[4]), data[5], Boolean.parseBoolean(data[6]),
	              Boolean.parseBoolean(data[7]));
	              
	              vehicleDataTypes.add(AmerCarType);
	              
	            break;
	            
	          case "foreign car":
	            for ( int i = 0; i < 8; i++){
	            data[i] = input.nextLine();
	            }
	            ForeignCar ForeCar = new ForeignCar(data[0], data[1], data[2], data[3],
	            Boolean.parseBoolean(data[4]), data[5], data[6], Float.parseFloat(data[7]));
	            
	            vehicleDataTypes.add(ForeCar);
	            
	            break;
	            
	           case "bicycle":
	            for( int i = 0; i < 5; i++){
	               data[i] = input.nextLine();
	              }
	            Bicycle bicycleData = new Bicycle (data[0], data[1], data[2],
	               data[3], Integer.parseInt(data[4]));
	               
	            vehicleDataTypes.add(bicycleData);
	            
	            break;
	            
	            case "truck":
	               for (int i = 0; i < 7; i++){
	                  data[i] = input.nextLine();
	               }
	              Truck truckType = new Truck (data[0], data[1], data[2],
	               data[3], Float.parseFloat(data[4]), Float.parseFloat(data[5]), data[6]);
	               
	            vehicleDataTypes.add(truckType);
	            
	            break;
	            }
	   
	      }
	      
	      input.close();//close the file
	      
	      printAll(vehicleDataTypes);
	      
	      Collections.sort(vehicleDataTypes, new Comparator<Vehicle>() {
	    	  public int compare(Vehicle v, Vehicle x) {
	    		  return v.compareTo(x);
	    	  }
	      });
	      //call all methods
	      printAll(vehicleDataTypes);
	      
	      printSize(vehicleDataTypes);
	      
	      System.out.print("\n");
	      
	      bicycleAndTruck(vehicleDataTypes);
	      
	      areaCode(vehicleDataTypes);
	  }
	   
	   public static void printSize(ArrayList<Vehicle> v){
		   System.out.println(v.size());
	   }
	   
	   public static void printAll(ArrayList<Vehicle> v){
		   for(int i = 0; i < v.size(); i++){
			   System.out.println(v.get(i));
		   }
		   
			   
	   }
	   
	   public static void bicycleAndTruck(ArrayList<Vehicle> v){
		   for(int i = 0; i < v.size(); i++){
			   	
			   if (v.get(i) instanceof Bicycle || v.get(i) instanceof Truck){
				System.out.println(v.get(i));   
			   		}
		   		}
		   
			   
		   }
	   
	   public static void areaCode(ArrayList<Vehicle> v){
		   for(int i = 0; i < v.size(); i++){
			   if(v.get(i).getPhoneNumber().substring(1,4).equals("987")){
				   System.out.println(v.get(i));
			   }
		   }
	   }
	   
}
	   
	      
	   
	class Vehicle{//vehicle class
	   private String ownersName;
	   private String address;
	   private String phoneNumber;
	   private String email;
	   
	   public Vehicle(String ownersName,String address,String phoneNumber,String email){
		   this.ownersName = ownersName;
		   this.address = address;
		   this.phoneNumber = phoneNumber;
		   this.email = email;
	   }
	   
	   public int compareTo(Object o){
		  return email.compareTo(((Vehicle) o).getEmail()); 
	   }
	   
	   
	   //setters and getters method
	  public String getOwnersName(){
		  return ownersName;
	   }
	   
	  public String getAddress(){
		  return address;
	   }
	   
	  public String getPhoneNumber(){
		  return phoneNumber;
	   }
	   
	  public String getEmail(){
		  return email;
	   }
	  
	  public void setOwnersName(String ownersName){
		  this.ownersName = ownersName;
	  }
	  
	  public void setAddress(String address){
		  this.address = address;
	  }
	  
	  public void setPhoneNumber(String phoneNumber){
		  this.phoneNumber = phoneNumber;
	  }
	  
	  public void setEmail(String email){
		  this.email = email;
	  }
	  
	   
	   //override toString method
	   public String toString(){
		   return  ownersName + "\n" + address + "\n" + phoneNumber +
				   " \n" + email + "\n";
	   }
	   
}  
	   
	   
	   //classs car extends Vehicle
	class Car extends Vehicle{
	   
	         private boolean convertible;
	         private String color;
	   
	            public Car(String ownersName,String address,String phoneNumber,String email, boolean convertible, String color){
	            super(ownersName, address, phoneNumber, email);
	            this.convertible = convertible;
	            this.color = color;
	            }
	   
	               public void setConvertible(boolean convertible){
	               this.convertible = convertible;
	               }
	   
	               public void setColor(String color){
	               this.color = color;
	               }
	               
	               public String getColor(){
	               return color;
	               }
	               
	               public boolean getConvertible(){
	               return convertible;
	               }
	               
	               public String toString(){
	               return super.toString()  + convertible + "\n" + color +"\n";
	               }
	       }
	//class americanCar extends Car   
	class AmericanCar extends Car{
	      
	      private boolean madeInDetroit;
	      private boolean unionShop;
	     
	         public AmericanCar(String ownersName,String address,String phoneNumber,String email, boolean convertible, String color, boolean madeInDetroit, boolean unionShop){
	         super(ownersName, address, phoneNumber, email, convertible, color);
	         this.madeInDetroit = madeInDetroit;
	         this.unionShop = unionShop;
	         }
	            public boolean getMadeInDetroit(){
	            return madeInDetroit;
	            }
	            
	            public boolean getUnionShop(){
	            return unionShop;
	            }
	            
	            public void setMadeInDetroit(boolean madeInDetroit){
	               this.madeInDetroit = madeInDetroit;
	               }
	               
	            public void setUnionShop(boolean unionShop){
	               this.unionShop = unionShop;
	               }
	               
	             public String toString(){
	             return super.toString() + madeInDetroit + "\n"
	              + unionShop +"\n";
	             }  
	      }
	                 
	 //class ForeignCar extends Car  
	class ForeignCar extends Car{
	      private String countryOfManu;
	      private float importDuty;
	      
	         public ForeignCar(String ownersName,String address,String phoneNumber,String email, boolean convertible, String color,
	         String countryOfManu, float importDuty){
	         
	         super(ownersName, address, phoneNumber, email, convertible, color);
	         this.countryOfManu = countryOfManu;
	         this.importDuty = importDuty;
	         }
	         
	         public String getCountryOfManu(){
	         return countryOfManu;
	         }
	         
	         public void setCountryOfManu(String countryOfManu){
	         this.countryOfManu = countryOfManu;
	         }
	         
	               
	         public void setImportDuty(float importDuty){
	         this.importDuty = importDuty;
	         }
	         
	         public float getImportDuty(){
	         return importDuty;
	         }
	         
	         public String toString(){
	         return super.toString()  + countryOfManu + " \n" +
	         importDuty + "\n";
	         }
	         

	   }
	//class Bicycle extends Vehicle   
	class Bicycle extends Vehicle{
	      private int numOfSpeeds;
	      
	         public Bicycle(String ownersName,String address,String phoneNumber,String email, int numOfSpeeds){
	         super(ownersName, address, phoneNumber, email);
	         
	         this.numOfSpeeds = numOfSpeeds;
	         
	         }
	         
	          public void setNumOfSpeeds(int numOfSpeeds){
	          this.numOfSpeeds = numOfSpeeds;
	          }
	          
	          public int getNumOfSpeeds(){
	          return numOfSpeeds;
	          }
	          
	          public String toString(){
	          return super.toString() + numOfSpeeds +"\n";
	          }
	     
	   }
	//class Truck extends Vehicle   
	class Truck extends Vehicle{
	      private float numOfTons;
	      private float costOfTruck;
	      private String date;
	      
	      
	         public Truck(String ownersName,String address,String phoneNumber,String email, float numOfTons, float costOfTruck, String date){
	            super(ownersName, address, phoneNumber, email);
	            this.numOfTons = numOfTons;
	            this.costOfTruck = costOfTruck;
	            this.setDate(date);
	            
	            }
	            
	           public void setNumOfTons(int numOfTons){
	           this.numOfTons = numOfTons;
	           }
	            
	           public void setCostOfTruck(int costOfTruck){
	           this.costOfTruck = costOfTruck;
	           }
	           
	           public float getNumOfTons(){
	           return numOfTons;
	           }
	           
	           public float getCostOfTruck(){
	           return costOfTruck;
	           }
	           
	           public String getDate() {
				return date;
			}

			public void setDate(String date) {
				this.date = date;
			}

			public String toString(){
	           return super.toString() + numOfTons + "\n" + costOfTruck +
	           "\n" + date + "\n";
	           }
	            
	      }
	     
	     
	      
	      
	  
	      
	      
	   
