package Codewars;

import java.util.ArrayList;
import java.util.List;

public class MusicCompressionEncoder {
    public static void main(String[] args) {
        int[] input1 = {1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        int[] input2 = {0, 2, 4, 5, 7, 8, 9};
        int[] input3 = {0, 2, 4, 5, 7, 6, 5};
        int[] input4 = {0, 2, 4, 5, 7, 6, 5, 5, 5, 5, 5};
      //  int[] input5 = {1,2,2,3};//,"1,2*2,3");
      //  int[] input6={1,3,4,5,7};//,"1,3-5,7");
        //int[] input7= {1,5,4,3,7};//,"1,5-3,7");
        int[] input8= {1,10,8,6,7};//,"1,10-6/2,7")
       // System.out.println(encode(input1)); // Output: "1,3-5,7-11,14,15,17-20"
        //System.out.println(encode(input2)); // Output: "0-4/2,5,7-9"
        //System.out.println(encode(input3)); // Output: "0-4/2,5,7-5"
        System.out.println(encode(input8)); // Output: "0-4/2,5,7-5,5*4"
    }

    public static String encode(int[] arr) {
        List<String> result = new ArrayList<>();
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int j = i;

            // Check for identical numbers
            while (j < n && arr[j] == arr[i]) {
                j++;
            }
            if (j - i > 1) {
                result.add(arr[i] + "*" + (j - i));
                i = j;
                continue;
            }

            // Check for consecutive numbers
            int k = i;
            while (k < n - 1 && ((arr[k + 1] == arr[k] + 1) || (arr[k + 1] == arr[k] - 1))) {
                k++;
            }
            if (k - i >= 2) {
                result.add(arr[i] + "-" + arr[k]);
                i = k + 1;
                continue;
            }

            // Check for same interval
            int l = i;
            System.out.println("l is = "+l);
            System.out.println("i is = "+i);
            while (l < n - 2 && (arr[l] - arr[l+1] == arr[l + 1] - arr[l + 2])) {
                l++;
            }
            if (l - i >= 1) {
                int interval = arr[i + 1] - arr[i];
                result.add(arr[i] + "-" + arr[l + 1] + "/" + Math.abs(interval));
                i = l + 2;
                continue;
            }

            // If no pattern, just add the number
            result.add(String.valueOf(arr[i]));
            i++;
        }

        return String.join(",", result);
    }
}
