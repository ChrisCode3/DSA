package DSA.Binary_Search;


/*Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
 If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.*/


public class Main {

    public static int search(int[] arr, int target) {



        int low =0;

        int high = arr.length -1;



      while (low <= high ) {

              int middle = low + (high - low) /2;
            if (target == arr[middle]) {

           //     System.out.println(middle);

                System.out.println( "he;lloooooooooo ");

                return middle;

            }

            if (target > arr[middle]) {
                low = middle +1;

            } else if (target < arr[middle]) {


                high = middle -1;

                }
            }

     //   while ( !middle < )
        System.out.println( " not here ");
        return -1;
    }





    public static void main(String[] args) {


        int arr[] = { -1,0,3,5,9,12};


        int n  = arr.length -1 ;

        int z =0;

      //  int middle = z + n / 2;

    //    search( arr , 8 , z , n);

  search( arr ,  165);



    }

}
