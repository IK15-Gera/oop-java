package aufgabe2;

/**
 * Created by fricke on 25.05.2016.
 */
public class Main {
    public static void main(String args[]){
        int day = 1 ;
        int month = 1 ;
        int year = 1970 ;

        String[] params ;

        for(int i = 0; i < 3; i++){
            try {
                params = args[i].split("=");
            }catch(Exception e){
                continue ;
            }

            switch(params[0]){
                case "tag":
                    day = Integer.parseInt(params[1]) ;
                    break ;
                case "monat":
                    month = Integer.parseInt(params[1]) ;
                    break ;
                case "jahr":
                    year = Integer.parseInt(params[1]) ;
                    break ;
            }
        }

        int wd = Main.getWeekday(day, month, year) ;
        if(wd > -1 || wd < 7){
            String wDay ;
            switch (wd){
                case 0:
                    wDay = "Sonntag" ;
                    break ;
                case 1:
                    wDay = "Montag" ;
                    break ;
                case 2:
                    wDay = "Dienstag" ;
                    break ;
                case 3:
                    wDay = "Mittwoch" ;
                    break ;
                case 4:
                    wDay = "Donnerstag" ;
                    break ;
                case 5:
                    wDay = "Freitag" ;
                    break ;
                case 6:
                    wDay = "Samstag" ;
                    break ;
                default:
                    wDay = "" ;
            }
            System.out.printf("Der %d.%d.%d ist ein %s", day, month, year, wDay) ;
        }else{
            System.out.println("Fehler") ;
        }
    }

    public static int getWeekday(int d, int m, int y){
        int day = d ;

        int month = m ;
        if(m < 3){
            month = m + 12 ;
        }

        int century = y/100 ;
        century = century * 100 ;
        int yshort = y - century ;

        double tmp = d ;
        tmp = tmp + 2.6 * (month + 1) ;
        tmp = tmp + 5 * yshort / 4 ;
        tmp = tmp + century / 4 + century * 5 ;
        tmp = tmp - 1 ;

        int weekday = ((int)tmp) % 7 ;

        return weekday ;
    }
}
