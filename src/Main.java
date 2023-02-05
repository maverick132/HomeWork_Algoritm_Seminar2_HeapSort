import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayGenerate arrayGenerateHeap = new ArrayGenerate();
        arrayGenerateHeap.FillArray(20);

        System.out.println("Array for Heap sort:");
        arrayGenerateHeap.PrintArray();


        arrayGenerateHeap.setArrayList(HeapSort.heapSort(arrayGenerateHeap.getArrayList()));
        System.out.println("Heap sort:");
        arrayGenerateHeap.PrintArray();
    }
}