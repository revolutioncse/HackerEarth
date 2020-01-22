package Trees.PriorityQueue;

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
    public static int maximum(int Arr[])
    {
        int max = Arr[1];
        return max;
    }
    public static int extract_max(int Arr[])
    {
        if(length==0)
        {
            System.out.println("Can’t remove element as queue is empty");
            return -1;
        }
        int max = Arr[1];
        Arr[1] = Arr[length];
        Arr[length] = 0;
        length = length -1;
        max_heapify(Arr, 1, length);
        return max;
    }
    static void increase_value(int Arr[],int i, int val)
    {
        if(val<Arr[i])
        {
            System.out.println("New value is less than current value, can’t be inserted");
            return;
        }
        Arr[i] = val;
        while(i>1 && Arr[i/2]<Arr[i])
        {
            swap(Arr, i/2, i);
            i = i/2;
        }
    }
    static void insert_value(int Arr[], int val)
    {
        length = length + 1;
        Arr[length] = -1;
        increase_value(Arr, length, val);
    }
    static int length = 5;
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

        int Arr[] = {0,8,7,4,3,1,0,0};
        for (int i : Arr) {
            System.out.print(i+" ");
        }
        //max_heapify(Arr, 1, 7);
        //build_maxheap(Arr);
        
        //insert_value(Arr, 6);
        extract_max(Arr);
        System.out.println();
        for (int i : Arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Length: "+length);
        // Write your code here

    }
}
