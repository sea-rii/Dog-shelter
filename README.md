Assignment - DOG SHELTER

In this project you will need to code a program to control the dogs that are in X shelter in Texas. Your program will allow the users to:
   • Assign/modify a dog's information (only weight) 
   • Change dogs between slots
   • Display a list of dogs (only weight)
   • Close the shelter (clear all the dogs' weights)
   • Show a report based on the classification (https://www.coastalpet.com/sizing-guide/)
   
Your program has to manage two global variables: the array containing the dogs' weight as gWeight and the gShelterSize that will be used to know how many dogs are in the shelter. Additionally, it will use a single Scanner as a global constant named gIN and a global constant of gMAX_DOGS equal to 100 for the maximum number of dogs allowed in the shelter.

Flow Diagram
Figure 1 shows the flow diagram with the necessary steps to be implemented for project 2. The frames in light blue denote the code to show/display information on the screen. The dark green frames indicate the method calls. The pink frames show the values that will be obtained from the user. The black diamonds denote decisions. The yellow frame shows what should be coded within a loop.

Details

The program will hold a global array with the name of gWeight with maximum slots of gMAX_DOGS. However, the real number of slots occupied by dogs in the shelter will be the first value to be specified by the user as gShelterSize, as shown in Figure 2. That variable value will be used by the program to know how many of the full array correspond to real data, starting from index 0.
   
The program will continue performing the user's operation as long as the selected option is not zero. The options in the main menu are explained in detail in table 1.

    Opt     Name                  Method             Procress description
    0       Exit                  none               Display the farewell
    1       Report                report             Show the number of dogs for every classification in a specific format (see the section of the report method for more details)
    2       Assign/Modify dogs    assignModifyDog    Assign or modify the weight of a dog in a specific slot
    3       (Ex)change Dog        changeDog          Swap dogs (weight) between different slots
    4       Close Shelter         closeShelter       Clear the weight of all dogs in the shelter
    5       List Dogs weight      listDogs           List the weight of al dogs for every slot

After the program successfully executed the user's selected option (1 to 5), the program will ask for the next option from the main menu that the user would like to select. Figure 3 shows an example of how to get the choice of the user.

The program should validate that the choice selected by the user is valid. If it is not valid, it should show a message as shown circled in red in Figure 4, followed by the title, options, and message to get the value again. Read page 7 for extra credit if you want to implement your program to be able to get the values in a centralized manner.

A detailed process for each of the options (methods) of the main method is explained next:
  
report()

This method will start by showing the title of the DOG'S REPORT. The method will show the different classifications of the dogs with their corresponding number of dogs. The program should call the method getDogsByClassification(classificationCode) that will return the number of dogs in the classification code sent as a parameter. The program will show the classification description (as shown in the table 2) and the number of dogs that correspond for every classification. 
 
      Letter     Description       Range
      4          Xlarge            90 <= weight <= 100
      3          Large             50 <= weight < 90
      2          Medium            30 <= weight < 50
      1          Small             20 <= weight < 30
      0          Xsmall            0 < weight < 20

assignModifyDog()

This method will perform the process detailed in Figure 7. As can be seen, the first step will be to get an integer as index that will be a valid index number based on the shelterSize (not to the maximum size of the array). Following that, it will get a double value as weight of a dog between 0.00 and 100.00. This process will end assigning the value weight to the specific index of the weights array.
  
This method should validate that the values are within the ranges for the index and the weight. The user should be able to select an index between 0 and gShelterSize. The weight should be valid between 0.00 and 100.00. If the values input by the user do not fall within the specified ranges, show the message: Value out of range, please, try again. Read the extra credit section in this document if you want to implement your program to be able to get the values in a centralized manner.

changeDog()

The method changeDog() will perform the process detailed in Figure 9. As can be seen, the first step will be to get an integer idxFrom that will be a valid index number, based on gShelterSize (not to the maximum size of the array). After that, the program will get a second valid integer index as idxTo that has to be different than idxFrom. This process will end swapping the weights between the indexes by calling the method swapValues(f, t), which will switch the values in idxFrom to idxTo and vice-versa.

Note that you may need to implement the concept mentioned in section 9.5 of the Zybook to swap the values. Figure 10 shows an example of the execution of the program when swapping values.

This method should validate that the values are within the ranges for the indexFrom and the indexto. The indexTo will have to be different than the indexFrom. Both indexes should be between 0 and gShelterSize. If an invalid number is input, prompt the user with the message Value out of range, please, try again. Read page 7 for extra credit if you want to implement your program to be able to get the values in a centralized manner.

closeShelter()

This method will set 0.00 to all the slots in the weights array.

listDogs()

This method will start by showing the title of the list. The method will then display the weight of the dog per index one by one. Figure 11 shows the process that needs to be implemented to list the weight of every dog in the shelter.

 Note that the program needs to validate the values of:
   - Main menu choice only values from 0 to 5.
   - Indexes (assign/modify, change dog) are only values for valid indexes (of real data, not of the array's length).
   - Weights are only values between 0.00 and 100.00.
   - 
For the output file, you have to upload it as it would be with the following input:
8 5 8 2 5 38.2 2 1 900 90.0 2 2 55.5 5 2 3 46.38 2 45 7 125.5 12.55 1 6 9 5 3 9 15 7 7 5 5 2 7 9.8 5 1 9 1 3 7 1 5 4 5 1 25 2 4 56.65 1 5 0
Note that every time the user inputs a value, the console will not show a line change when exported to a text file. However, if you open the same text file in DrJava you will see it correctly.

 
