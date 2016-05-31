package aufgabe3_6;

/**
 * Created by fricke on 30.05.2016.
 */
public class BigInt{
    String value ;

    BigInt(BigInt v){
        this.set(v) ;
    }

    BigInt(int v){
        this.set(v) ;
    }

    BigInt(String v){
        this.set(v) ;
    }

    public void set(int v){
        this.value = Integer.toString(v) ;
    }

    public void set(BigInt v){
        this.value = v.get() ;
    }

    public void set(String v){
        for(int i = 0; i < v.length(); i++){
            if(v.charAt(i) == '0'
                    || v.charAt(i) == '1'
                    || v.charAt(i) == '2'
                    || v.charAt(i) == '3'
                    || v.charAt(i) == '4'
                    || v.charAt(i) == '5'
                    || v.charAt(i) == '6'
                    || v.charAt(i) == '7'
                    || v.charAt(i) == '8'
                    || v.charAt(i) == '9'){
                continue ;
            }else{
                throw new java.lang.NumberFormatException("illegal char at '"+i+"': "+v.charAt(i)) ;
            }
        }
        this.value = v ;
    }

    public String get(){
        return this.value ;
    }

    public BigInt add(BigInt s){
        String valb = s.get() ;
        String result  = "" ;


        int a ;
        int b ;

        int rest = 0 ;
        int step ;
        int len = Math.max(valb.length(), this.value.length()) ;
        for(int i = 0; i < len || rest != 0; i++){
            try{
                a = Integer.parseInt(""+this.value.charAt(this.value.length() - 1 - i));
            }catch(java.lang.IndexOutOfBoundsException e){
                a = 0 ;
            }

            try{
                b = Integer.parseInt(""+valb.charAt(valb.length() - 1 - i));
            }catch(java.lang.IndexOutOfBoundsException e){
                b = 0 ;
            }

            step = a + b + rest ;
            rest = step / 10 ;
            result = Integer.toString(step%10)+result ;
        }

        BigInt ret = new BigInt(result) ;
        return ret ;
    }
}
