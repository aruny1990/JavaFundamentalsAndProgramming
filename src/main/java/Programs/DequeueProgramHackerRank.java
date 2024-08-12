package Programs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DequeueProgramHackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        
        int maxUnique = 0;
        
        for (int i = 0; i < n; i++) {
            deque.add(arr[i]);
            set.add(arr[i]);
            
            if (deque.size() == m) {
                if (set.size() > maxUnique) {
                    maxUnique = set.size();
                }
                int removedElement = deque.remove();
                if (!deque.contains(removedElement)) {
                    set.remove(removedElement);
                }
            }
        }
        
        System.out.println(maxUnique);
        
        sc.close();
    }
}
