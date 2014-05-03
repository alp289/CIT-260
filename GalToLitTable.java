/*
  This program displays a conversion
  table of gallons to liters
*/
class GalToLitTable {
    public static void main(String args[]){
        double gallons, litters;
        int counter;
        
        counter = 0; //Line counter is initially set to zero
        for(gallons = 1; gallons <= 100; gallons++){
            litters = gallons * 3.7854; // convert to liters
            System.out.println(gallons + " gallons is " + litters + " litters.");
            
            counter++; /* Icrement the line counter with each loop iteration.
                         Every 10th line, print a blank line */
            if (counter == 10){ //If counter is 10 output a blank line
                System.out.println();
                counter = 0; // reset the line counter
            }
        } 
    } 
}
