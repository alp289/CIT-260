/*
This program converts Galons to Liters
*/
class GalToLit {
    public static void main(String args[]){
        double gallons; // holds the number gallons
        double litters; // holds conversion to litters
    
        gallons = 10; // start with 10 gallons
        litters = gallons * 3.7854; // convert to liters
        
        System.out.println(gallons + " gallons is " + litters + "litters.");
        
    }
}