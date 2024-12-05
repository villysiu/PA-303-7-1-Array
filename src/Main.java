import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void task1(){
        int[] arr = new int[3];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }

        for(int n: arr){
            System.out.println(n);
        }
    }
    public static void task2(){
        int [] arr = {13, 5, 7, 68, 2};
        int mid = arr.length/2;
        System.out.println(arr[mid]);

    }
    public static void task3(){
        String [] arr = {"red", "green", "blue", "yellow" };
        System.out.println(arr.length);

        String [] copy = arr.clone();
        System.out.println(Arrays.toString(copy));
    }

    public static void task4() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
        int len = arr.length;
        System.out.println(arr[len]);
        System.out.println(arr[5]);

    }
    public static void task5() {
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void task6() {
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i * 2;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void task7() {
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            if(i==2)
                continue;
            arr[i] = i ;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void task8() {
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println("Initial array: " + Arrays.toString(arr));
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
        System.out.println("Array after swapping: " + Arrays.toString(arr));
    }
    public static void task9() {
        int[] arr = {4, 2, 9, 13, 1, 0};
        Arrays.sort(arr);

        System.out.println("Array in ascending order: " + Arrays.toString(arr));
        System.out.println("The smallest number is " + arr[0]);
        System.out.println("The biggest number is " + arr[arr.length-1]);
    }
    public static void task10() {
        Object [] arr = {3, "hello", 2.334};
        System.out.println(Arrays.toString(arr));
    }
    public static void task11() {

        int size = 0;
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.print("How many favorite things do you have? ");

            if (sc.hasNextInt()) {
                size = sc.nextInt();
                validInput = true;
                sc.nextLine(); //Consume the line to accomodate thing string inpit

            } else {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Consume the non-integer input
            }

        }

//        Scanner fav = new Scanner(System.in);
        String[] favorites = new String[size];
        String thing = "";
        for(int i = 0; i < size; i++){

            do{
                System.out.print("Enter your thing "+ (i+1) +":");
                thing = sc.nextLine().trim();
                if(thing.isEmpty()){
                    System.out.println("Thing cannot be empty. Please try again.");
                }
            } while(thing.isEmpty());
            favorites[i] = thing;
        }



        sc.close();

        System.out.println("Your favorite  things are:\n" + Arrays.toString(favorites));
    }
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
        task11();
    }
}
