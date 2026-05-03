package DSA.Rosetta_Stone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */

    /**
     * Iterate through each line of input.
     */
    public class Main {

        public static void call(int x) {


        }

        ;

        /**
         * Iterate through each line of input.
         */
        public static void main(String[] args) throws IOException {
            InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
            BufferedReader in = new BufferedReader(reader);
            String line;

            boolean counter = false;

            boolean  counter2 = false;

            ArrayList<String> myArraylist =  new ArrayList<>();

            ArrayList<String> myArraylist2 =  new ArrayList<>();
         //   line = in.readLine();

         //   myArraylist.add(line);

            while ((line = in.readLine()) != null) {
              //  System.out.println(line);


             //   myArraylist = new ArrayList<>();

                int i =0;



                if (!counter2) {
                    myArraylist2.add(line);


                }

                if(counter) {

                    while (!(line.charAt(i) == '|')) {


                        i = i + 1;

                        //   myArraylist.add(line);

                        String key = new String();
                        String value = new String();
                        if ((line.charAt(i) == '|')) {

                            myArraylist.add(line.substring(0, i));
                            myArraylist.add(line.substring(i + 1));


                            key = line.substring(0, i);
                            System.out.println(key);

                            value = line.substring(i + 1);
                            System.out.println(value);

                            //  myArraylist.indexOf()

                        }


                        //  myArraylist2.set(0).replace(line.substring(0, i), line.substring(i +1));


                        myArraylist2.set(0, myArraylist2.get(0).replace(key, value));


                        System.out.println(myArraylist2);


                        // if()
                    }




                    //   if(line.charAt())


             //      myArraylist.add(line);

                }




            counter = true;

                counter2 = true;

           //     if (myArraylist)
                System.out.println(myArraylist2);


            }



        }
    }

