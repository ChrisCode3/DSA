package DSA.Two_Sum;




 // The Two Sum problem asks you to find the indices of two numbers in an array that add up to a specific target value


/*

• Input: An array of integers (nums) and an integer (target).
• Output: The indices of the two numbers that sum up to the target.
• Constraints: Each input has exactly one solution, and you cannot use the same array element twice

 */


import java.util.HashMap;

public class Main {


/*
    public static  int[] TwosumBruteForce( int arr [], int sum) {
       for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {};
*/



    public  static  void  TwosumOptimized( int arr [], int sum) {


        HashMap <Integer , Integer> myHashmap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            myHashmap.put(arr[i] , i);

            int remainer = sum  - arr[i];

            if (myHashmap.containsKey(remainer)) {

                System.out.println(  myHashmap.get(remainer));

                System.out.println(   i );
            }
            myHashmap.put(arr[i] , i);
        }


        System.out.println(" This is gonna print the Array jumbled up . As the keys in a hashmap are scarabbled  ");

        for ( int x  : myHashmap.keySet()) {


            System.out.println(x);

        }



    }




    public static void main(String[] args) {




        int x [] =  {1 ,3, 5,10 , 2};


        int TargetSum = 13;


   //     TwosumBruteForce( x , TargetSum);

        TwosumOptimized(x , TargetSum);
    }
}


