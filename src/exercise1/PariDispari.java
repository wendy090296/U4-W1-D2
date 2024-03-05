package exercise1;




public class PariDispari {
    public static void main(String[] args) {
        String string= "the show must go on";
        boolean result= stringaPariDispari(string);
        System.out.println(result);



        }
        public static boolean stringaPariDispari(String string){

                if(string.length() % 2 == 0){
                    return true;
                }else{
                    return false;
                }


        }
    }
