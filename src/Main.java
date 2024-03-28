import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

       //  int[] array= {10,9,8,7,6,5,4,3,2,1};
          int[] array ={1,2,3,4,5,6,7,8,9,10};

                  int counter = 0;
                  System.out.println("Before: ");
                  System.out.println(Arrays.toString(array));
        boolean h= true;


       for( int i=1; i<array.length && h; i++) {
           counter++;
           h = false;


           for (int j = 0; j < array.length - i; j++) {
               counter++;
               if (array[j] > array[j + 1]) {
                   counter++;
                   int greater = array[j];
                   array[j] = array[j + 1];
                   array[j + 1] = greater;
               }
           }
       }

        System.out.println("after");
        System.out.println(Arrays.toString(array));
        System.out.println("Number of actions taken: " + counter);

    }
}


//    int[] array= {10,9,8,7,6,5,4,3,2,1};
//
//
//    int counter = 0;
//                  System.out.println("Before: ");
//                          System.out.println(Arrays.toString(array));
//
//                          for( int i=0; i<array.length-1; i++) {
//        counter++;
//
//
//        for (int j = 0; j < array.length - 1; j++) {
//        counter++;
//        if (array[j] > array[j + 1]) {
//        counter++;
//        int greater = array[j];
//        array[j] = array[j + 1];
//        array[j + 1] = greater;
//        }
//        }
//        }
//        System.out.println("after");
//        System.out.println(Arrays.toString(array));
//        System.out.println("Number of actions taken: " + counter);











//    int counter = 0;
//                  System.out.println("Before: ");
//                          System.out.println(Arrays.toString(array));
//
//                          for( int i=1; i<array.length; i++) {
//        counter++;
//
//
//        for (int j = 0; j < array.length - i; j++) {
//        counter++;
//        if (array[j] > array[j + 1]) {
//        counter++;
//        int greater = array[j];
//        array[j] = array[j + 1];
//        array[j + 1] = greater;
//        }
//        }
//        }
//        System.out.println("after");
//        System.out.println(Arrays.toString(array));
//        System.out.println("Number of actions taken: " + counter);
