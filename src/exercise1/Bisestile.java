package exercise1;

public class Bisestile {
    public static void main(String[] args) {
        int year= 2024;
                boolean result=annoBisestile(year);
        System.out.println(result);




    }

    public static boolean annoBisestile(int year){
        if(year % 4== 0 ) {
            return true;
        }else{
            return false;
        }


    }
}
