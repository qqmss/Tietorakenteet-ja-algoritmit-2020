package binarysearch;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class BinarySearch {

    private int[] ints = new int[100];

    public BinarySearch() {
        ints[0] = ThreadLocalRandom.current().nextInt(10);
        for (int i = 1; i < ints.length; i++) {
            ints[i] = ints[i - 1] + ThreadLocalRandom.current().nextInt(10);
        }
    }

    public int indexOf(int i) {
        //Binary Search
        int low = 0, up = ints.length - 1;
        while (low != up - 1) {
            int middle = (low + up) / 2;
            System.out.println("low: " + low + " up:" + up + " middle:" + middle);
            if (ints[middle] > i) {
                up = middle;
            } else if (ints[middle] < i) {
                low = middle;
            } else {
                return middle;
            }
        }
        if (ints[low] == i) {
            return low;
        } else if (ints[up] == i) {
            return up;
        }
        return -1;
    }

    public int get(int i) {
        return ints[i];
    }

    public void add(int iAdd){
        int[] newArray =  new int[ints.length + 1];
        if(iAdd <= ints[0]){
            newArray[0] = iAdd;
            for(int i = 1; i < newArray.length; i++){
                newArray[i] = ints[i - 1];
            }
        } else if (iAdd >= ints[ints.length - 1]){
            for(int i = 0; i < ints.length; i++){
                newArray[i] = ints[i];
            }
            newArray[newArray.length - 1] = iAdd;
        } else {
            int low = 0, up = ints.length - 1;
            int middle = (low + up) / 2;
            while (low != up - 1) {
                System.out.println("low: " + low + " up:" + up + " middle:" + middle);
                if (ints[middle] > iAdd) {
                    up = middle;
                } else if (ints[middle] < iAdd) {
                    low = middle;
                }
                middle = (low + up) / 2;
            }
            for (int i = 0; i < middle; i++) {
                newArray[i] = ints[i];
            }
            newArray[middle] = iAdd;
            for (int i = middle + 1; i < newArray.length; i++) {
                newArray[i] = ints[i - 1];
            }
        }
        ints = newArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(ints);
    }
}
