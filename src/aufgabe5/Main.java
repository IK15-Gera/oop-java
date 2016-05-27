package aufgabe5;

import java.util.Scanner ;

/**
 * Created by fricke on 25.05.2016.
 */
public class Main {
    public static void main(String[] args){
        int inp ;
        Scanner in = new Scanner(System.in) ;
        System.out.print("Zahl eingeben (0 für ende): ") ;
        inp = in.nextInt() ;
        while(inp > 0){
            if(Main.isPz(inp)){
                System.out.printf("%d ist eine Priemzahl\n", inp) ;
            }else{
                System.out.printf("%d ist keine Priemzahl\n", inp) ;
            }
            System.out.print("\nZahl eingeben (0 für ende): ") ;
            inp = in.nextInt() ;
        }
    }

    public static boolean isPz(int z){
        int div = 2 ;
        boolean test = true ;
        while(z > div*div){
            if(z % div == 0){
                test = false ;
                break ;
            }

            if(div % 2 == 0){
                div = div + 1 ;
            }else{
                div = div + 2 ;
            }
        }
        return test ;
    }
}
