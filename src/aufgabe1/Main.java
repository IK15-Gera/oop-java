package aufgabe1;

/**
 * Created by fricke on 25.05.2016.
 */
public class Main {
    public static void main(String[] args){
        String name ;
        try {
            name = args[0];
        }catch(Exception e){
            name = "" ;
        }

        double price ;
        try {
            price = Double.parseDouble(args[1]);
            price = price / 100 ;
        }catch(Exception e){
            price = 1 ;
        }

        double mass ;
        try {
            mass = Double.parseDouble(args[2]);
            mass = mass / 1000 ;
        }catch(Exception e){
            mass = 0 ;
        }

        double tax ;
        try{
            tax = Double.parseDouble(args[3]) ;
            tax = tax / 100 ;
        }catch(Exception e){
            tax = 0 ;
        }

        if(name != "" && price != 0 && mass != 0 && tax != 0){
            Main.print(name, mass, price, tax) ;
        }else{
            System.out.println("Fehlerhafte Eingabe!");
        }
    }

    public static void print(String name, double mass, double price, double tax){
        System.out.printf("%.3f kg %s\n", mass, name) ;
        System.out.printf("für %.2f € pro kg\n", price) ;
        System.out.printf("kosten %.2f €\n", price*mass) ;
        System.out.printf("incl. %.2f € MwSt\n", price*mass*tax) ;
    }
}
