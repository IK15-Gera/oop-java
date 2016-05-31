package aufgabe3_6;

/**
 * Created by fricke on 31.05.2016.
 */
public class Fibonacci {
    public static void main(String[] args){
        BigInt a = Fibonacci.compute(10) ;
        System.out.println("10: "+Fibonacci.compute(10).get());
        System.out.println("46: "+Fibonacci.compute(46).get());
        System.out.println("92: "+Fibonacci.compute(92).get());
        System.out.println("1000: "+Fibonacci.compute(1000).get());
    }


    public static BigInt compute(int n) {
        BigInt result = new BigInt(0);
        if (n <= 0){ // fuer negative Zahl auch 0!
            return result;
        }else if(n==1) {
            result.set(1) ;
            return result;
        }else{
            BigInt a = new BigInt(1) ; // hat am Anfang der Schleife den Wert Fib(i-2)
            BigInt b = new BigInt(1) ; // hat am Anfang der Schleife den Wert Fib(i-1)
            BigInt aa = new BigInt(0) ;
            BigInt bb = new BigInt(0) ;
            int i=2;
            while(i<=n) { // Schleife fuer alle Werte von 2 bis n {
                aa.set(b) ; // Wert von Fib(i-1)
                bb.set(a.add(b)) ; // Wert von Fib(i)
                a.set(aa) ; // Vorbereitung fuer den naechsten Durchgang
                b.set(bb) ; // Vorbereitung fuer den naechsten Durchgang
                i++;
            }
            return b;
        }
    }
}
