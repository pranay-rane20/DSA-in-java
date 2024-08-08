package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class L414 {
    public static int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);

        int []arr = new int[set.size()];
        int j=0;
        for(int i : set){
            arr[j++] = i;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        if(arr.length == 1)return arr[0];
        else if(arr.length == 2)return arr[1];

        return arr[arr.length-3];
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(thirdMax(arr));
    }
}
