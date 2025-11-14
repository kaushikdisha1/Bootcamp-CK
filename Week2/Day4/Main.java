import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 3. Find the First Non-Repeating Character.
class FirstNonRepeating {
    void solve() {
        String s = "aabbcddee";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                return;
            }
        }
        System.out.println("No non-repeating character found");
    }
}


// 4. Given an array of integers and a target sum, return the indices of the two numbers that add up to the target.
class TwoSum {
    void solve() {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int remaining = target - arr[i];
            if(map.containsKey(remaining)) {
                System.out.println("Two indices: " + map.get(remaining) + ", " + i);
                return;
            }
            map.put(arr[i], i);
        }
    }
}


// 5. You are given two sorted ArrayLists<Integer>. Merge them into a single sorted list.
class MergeSorted {
    void solve() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 3, 5));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2, 4, 6));
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;
        while(i < a.size() && j < b.size()) {
            if(a.get(i) < b.get(j)) result.add(a.get(i++));
            else result.add(b.get(j++));
        }
        while(i < a.size()) result.add(a.get(i++));
        while(j < b.size()) result.add(b.get(j++));

        System.out.println("Merged List: " + result);
    }
}


// 6. Write a Java program with two threads: Thread 1 prints table of number 2. Thread 2 prints table of number 4.
// Threads should be synced to print output one by one.
class PrintTable {
    synchronized void print(int n) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + n + " x " + i + " = " + (n * i));
            try { 
                wait(400); 
            } catch(Exception e) {

            }
            notify();
        }
    }
}

class ThreadSync {
    void runThread() {
        PrintTable obj = new PrintTable();

        Thread t1 = new Thread(() -> obj.print(2));
        Thread t2 = new Thread(() -> obj.print(4));

        t1.start();
        t2.start();
    }
}


// 7. Write above program using ExecutorService.

class PrinterTask implements Runnable {
    int n;
    PrinterTask(int n) { 
        this.n = n; 
    }

    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.println(Thread.currentThread().getName() + ": " + n + " x " + i + " = " + (n * i));
    }
}

class ExecSer {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.submit(new PrinterTask(2));
        ex.submit(new PrinterTask(4));
        ex.submit(new PrinterTask(6));
        ex.submit(new PrinterTask(8));
        ex.shutdown();
    }
}



//Main Class
public class Main {
    public static void main(String[] args) {

        // Q3:
        // new FirstNonRepeating().solve();

        // Q4:
        // new TwoSum().solve();

        // Q5:
        // new MergeSorted().solve();

        // Q6:
        // new ThreadSync().runThread();

        // Q7:
        new ExecSer().main(new String[]{});
    }
}