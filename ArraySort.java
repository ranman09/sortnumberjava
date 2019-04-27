package com.javaudemy;

public class ArraySort {

    static int loopA, loopB;

    public static void main(String[]args){
        int [] numbers = {2,4,6,1,5,3};

        numbers = arrange(numbers);

        for (int val : numbers){
            System.out.println(val);
        }

        System.out.println();
        System.out.println("Arranged: " + loopA + "\nChecked: " + loopB);

    }

    private static int [] arrange(int [] array){
        int backup = 0;

        while (!check(array)){

            for (int i = 0 ; i <= (array.length - 2) ; i++){
                if (array[i] > array[i+1]){
                    backup = array[i];
                    array[i] = array[i+1];
                    array[i+1] = backup;
                }

                loopA += 1;
            }

        }

        return array;
    }

    private static boolean check(int [] array){
        boolean rtn = true;

        for (int i = 0 ; i <= (array.length - 2) ; i++){
            if (array[i] > array[i+1]){
                rtn = false;
            }

            loopB += 1;
        }

        loopB += 1;
        return rtn;

    }

}
