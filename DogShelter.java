import java.util.Scanner;

public class DogShelter{
  
  static int gMAX_DOGS = 100;
    static int gShelterSize;      //Shelter Size 
    static int num1;     
    static Scanner gIN = new Scanner(System.in);      // global scanner
    static double[] gWeight = new double[gMAX_DOGS];    // global array
    
  public static void main(String[] args){
  
    System.out.println("UTSA - Spring2022 - CS1083 - Section 001 - Project 2 - TexasShelter - written by Sai Siri Chittineni");
    
    do{          // do-while loop to print the error statement if the value is out of range
      System.out.print("Please, enter the number of dogs in the shelter (Max 100): ");
      gShelterSize = gIN.nextInt();
      if ((gShelterSize > 100) || (gShelterSize < 1)){
        System.out.println("Value out of range, please, try again");
      }
    } while ((gShelterSize > 100) || (gShelterSize < 1));
    
    double[] dogs = new double[gShelterSize];
    double num1;
    do{ 
      System.out.println("MAIN MENU");
      System.out.println("0 - Exit, 1 - report, 2 - Assign/Modify dogs, 3 - (EX)Change Dog, 4 - Close Shealter, 5 - List");
      System.out.println("Select an option: ");
      num1 = gIN.nextDouble();     // variable for the selection of MAIN MENU methods
                        
                           
       if (num1 == 0){
          System.out.print("Thank you for looking at the Dog Shelter info! Bye!");
          break;
       }
       else if (num1 == 1){
          report();
       }
       else if (num1 == 2){
          assignModifyDog();
       }
       else if (num1 == 3){
          changeDog();
       }
       else if (num1 == 4){
          closeShelter();
       }
       else if (num1 == 5){
          listDogs();
       } 
       else {
         System.out.println("Value out of range, please, try again");
       }
    }while (num1 != 0);
 }
      
  public static void report(){
     System.out.println("DOGS REPORT");
     for (int i=4; i>=0; i--){
       int classificationCode = i;
       if (classificationCode == 4){
          System.out.print("Xlarge : ");
       }
       else if (classificationCode == 3){
          System.out.print("Large  : ");
       }
       else if (classificationCode == 2){
          System.out.print("Medium : ");
       }
       else if (classificationCode == 1){
          System.out.print("Small  : ");
       }
       else if (classificationCode == 0){
          System.out.print("Xsmall : ");
       }
       System.out.println(getDogsByClassification(i) + "");   
     }

     
   }
      
      
  public static int getDogsByClassification(int classificationCode){ 
    int count = 0;     
    for (int i=0; i < gShelterSize; i++){
      double weight = gWeight[i];
     
        
      if ((classificationCode == 4) && (weight <=100.0 && weight >= 90.0)){
        count++;
      }
      else if ((classificationCode == 3) && (weight <90.0 && weight >= 50.0)){
        count++;
      }
      else if ((classificationCode == 2) && (weight <50.0 && weight >= 30.0)){
        count++;
      }
      else if ((classificationCode == 1) && (weight <30.0 && weight >= 20.0)){
        count++; 
      }
      else if ((classificationCode == 0) && (weight <20.0 && weight > 0.0)){
        count++;
      }
    
    }
    
    return count;   
  }
  
  public static void assignModifyDog(){
    int index;
    do{
      System.out.println("Enter the index(0 to " + (gShelterSize - 1) + ") :");
      index = gIN.nextInt();
      if ((index >= gShelterSize) || (index < 0)){
        System.out.println("Value out of range, please, try again"); 
      }
    }while ((index >= gShelterSize) || (index < 0));
    
    System.out.println("The current weight of dog at " + index + " is : " + gWeight[index]);
   
    double newWeight = 0.0;
    System.out.println("Enter the weight of the new dog (0.00 - 100.00) : ");
    newWeight = gIN.nextDouble();
      
    gWeight[index] = newWeight;     // assigning new weight 
  }
  
  public static void changeDog(){
      int idxTo;
      int idxFrom;
     do{
       
      System.out.println("Enter the position from (0 to " + (gShelterSize-1) + ") : ");
      idxFrom = gIN.nextInt();
      while ((idxFrom > gShelterSize) || (idxFrom < 0)){
        System.out.println("Value out of range, please, try again");
        System.out.println("Enter the position from (0 to " + (gShelterSize-1) + ") : ");
        idxFrom = gIN.nextInt();
      }
      System.out.println("Enter the position to change to (0 to " + (gShelterSize-1) + ") that is not "+ idxFrom + " : ");
      idxTo = gIN.nextInt();
      
      while ((idxTo > gShelterSize) || (idxTo < 0)){
        System.out.println("Value out of range, please, try again");
        idxTo = gIN.nextInt();
      }
      if (idxFrom == idxTo){
        System.out.println("cannot swap, please put in two different inputs");
      }
        
    }while ((idxFrom > gShelterSize) && (idxFrom < 0) || (idxFrom == idxTo));
    
    double tempVal = 0.00;       // tempVal to swap idxFrom and idxTo
    tempVal = gWeight[idxTo];
    gWeight[idxTo] = gWeight[idxFrom];
    gWeight[idxFrom] = tempVal;
            
  } 
 
  public static void closeShelter(){
    for (int i=0; i<gShelterSize; i++){
      gWeight[i] = 0.00;      // assigning all weights to 0.0
      
    }
  }
  
  public static void listDogs(){
    System.out.println("LIST OF DOGS WEIGHT");
    for (int i=0; i<gShelterSize; i++){
      System.out.println("Dog[" + i + "] : " + gWeight[i]);
    }
  }   
     
}
