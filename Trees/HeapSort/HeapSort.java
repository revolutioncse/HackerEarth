package Trees.HeapSort;

/* IMPORTANT: Multiple classes and nested static classes are supported */


 // uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void max_heapify(int Arr[],int i, int N)
    {
        int largest=0;
        int left=i*2;
        int right=i*2+1;
        if(left<=N && Arr[left]>Arr[i])
        {
            largest = left;
        }
        else{
            largest = i;
        }
        if(right<=N && Arr[right]>Arr[largest])
        {
            largest = right;
        }
        if(largest!=i)
        {
            swap(Arr, i, largest);
            max_heapify(Arr, largest, N);
        }
    }
    public static void build_maxheap(int Arr[])
    {
        int N=Arr.length-1;
        for(int i=N/2;i>=1;i--)
        {
            max_heapify(Arr, i, N);
        }
    }
    public static void swap(int Arr[], int i, int j)
    {
        int temp=Arr[i];
        Arr[i] = Arr[j];
        Arr[j] = temp;
    }
    public static void heap_sort(int Arr[])
    {
        int N = Arr.length-1;
        int heap_size = N;
        build_maxheap(Arr);
        for(int i=N;i>=2;i--)
        {
            swap(Arr, 1, i);
            heap_size = heap_size-1;
            max_heapify(Arr, 1, heap_size);
        }
    }
    public static void main(String args[] ) throws Exception {
        // Sample code to perform I/O:
         // Use either of these methods for input

        //BufferedReader
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String name = br.readLine();                // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        // //Scanner
        // Scanner s = new Scanner(System.in);
        // String name = s.nextLine();                 // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        int Arr[] = {0,1,4,3,7,8,9,10};
        for (int i : Arr) {
            System.out.print(i+" ");
        }
        //max_heapify(Arr, 1, 7);
        //build_maxheap(Arr);
        heap_sort(Arr);
        System.out.println();
        for (int i : Arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        // Write your code here

    }
}
