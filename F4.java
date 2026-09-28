// F4. Find the first number from 1 to 50 that is divisible by 7 and print it after the loop ends.
public class F4 {
    public static void main(String[] args) {
        int result = number();
        System.out.println(result);
    }
    static int number( ){
       for(int i=1; i <= 50; i++){
           if(i%7==0){
return i;
           }
       }
           return 0;
       }

        }

