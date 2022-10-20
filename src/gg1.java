import java.util.Arrays;
import java.util.Random;

public class gg1 {
    static int size = 10;
    static int[] arr = new int[size];

    public static void main(String[] args) {
        fillRandom();
        print();
        //bubbleSorter();
        //selectionSort();
        //combSort();
        //oddEvenSort();
        //shakeSort();
        //dummySort();
        //gnomeSort();
        bogoSort();
        print();
    }

    static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < size; i++)
            arr[i] = random.nextInt(90) + 10;
    }

    static void print() {
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSorter() {
        for (int j = 0; j < size; j++)
            for (int i = 0; i < size - 1; i++)
                if (arr[i] > arr[i + 1]) {
                    swap(i, i + 1);
                }
    }

    static void selectionSort() {
        for (int i = 0; i < size; i++) {
            int min = arr[i];
            int index = 0;
            for (int j = i + 1; j < size; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            if (index != 0)
                swap(i, index);
        }
    }

    static void combSort() {
        double factor = 1.2473309;
        int step = size - 1;
        while (step >= 1) {
            for (int i = 0; i + step < size; i++) {
                if (arr[i] > arr[step + i])
                    swap(i, step + i);
            }

            step /= factor;
        }

    }

    static void oddEvenSort() {
        for (int i = 0; i < size - 1; i++)
            for (int j = i % 2 == 0 ? 0 : 1; j < size - 2; j += 2) {
                if (arr[j] > arr[j + 2])
                    swap(j, j + 2);
            }
        bubbleSorter();
    }

    static void shakeSort() {
        int left = 0;
        int right = size - 1;
        do {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(i, i + 1);
                }
                right--;
            }
            for (int i = right; i > left; i--){
                if (arr[i] < arr[i - 1]) {
                    swap(i, i-1 );
                }
                left++;}
            }
            while (left != right) ;}
    static void dummySort(){
        int i=0;
        while(i<size-1){
            if (arr[i]>arr[i+1]){
                swap(i,i+1);
                i=0;}
        else i++;}}
    static void gnomeSort(){
        for(int i =0; i<size;i++)
            for (int j=i; j>0 && arr[j]<arr[j-1];j--)
                swap(j,j-1);
    }
    static void shuffle(){
        Random random=new Random();
        for (int i=0; i<size;i++)
            swap(i,random.nextInt(size));}
    static boolean isSorted(){
        for (int i = 0;i<size-1; i++)
            if (arr[i]>arr[i+1])
                return false;
        return true;}
    static void bogoSort(){
        while (!isSorted())
            shuffle();
    }
    }













//int temp = arr[i];
//arr[i]= arr[i+1];
//arr[i+1]= temp; }
