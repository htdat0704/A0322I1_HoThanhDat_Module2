package ss4_class_and_object.bai_tap.StopWatch;

import java.util.Random;

public class SelectionSort {
    void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        StopWatch stopWatch = new StopWatch();
        int arr[] = new int[100000];

        for(int i=0; i<100000;i++){
            Random rand = new Random();
            int ranNum = rand.nextInt(100000)+1;
            arr[i] = ranNum;
        }

        stopWatch.start();
        obj.sort(arr);
        stopWatch.stop();
        System.out.println("after Selection Sort 100000 about: "+stopWatch.getElapsedTime()+" mili second");

    }
}
