package aufgabe3_6;

/**
 * Created by fricke on 30.05.2016.
 */
public class BigInt{
    String value ;

    BigInt(int v){
        this.set(v) ;
    }

    public void set(int v){
        this.value = Integer.toString(v) ;
    }

    public String get(){
        return this.value ;
    }

    public BigInt add(BigInt s){
        String valb = s.get() ;

        int len = Math.max(valb.length(), this.value.length()) ;
        for(int i = 0; i < len; i++){

        }
    }
}
