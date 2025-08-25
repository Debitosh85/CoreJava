package Practice;

/*public class Repetition {

    public static void main(String[] args) {

        int x = 1;

        do{
            ++x;
            System.out.println(x);
            x++;
        }
        while(x<=10);
    }

}*/

/*public class Repetition{
    public static void main(String[] args) {

        int x = 10;

        while(x>=-1){
            System.out.println(x);
            x--;
        }
        
    }
}*/

/*public class Repetition{
    public static void main(String[] args) {

        for(int i =1;i<=10;i++){
            System.out.println(i);
        }
        
    }
}*/

/* public class Repetition {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };

        for (int number : arr) {

            System.out.println("Numbers are in array::" + number);Ā
        }
    }
}
 */

/* public class Repetition {
    public static void main(String[] args) {

        String cities[] = { "Hyd", "BBSR", "Pune", "Maharashtra", "Puri", "Cuttack" };

        java.util.Arrays.sort(cities);

        for (String inCities : cities) {
            System.out.println(inCities);
        }

    }
} */

public class Repetetion{
    public static void main(String[] args) {
        
        Object [] arr= {"Ram","Shyam",90.90,'A',73,true};

        //arr.sort -> if we are trying to Sort an Object array it gave Exception java.lang.ClassCastException

        for(Object arrs:arr){
            System.out.println("Multiple Values in Object Array::"+arrs);
        }
    }
}