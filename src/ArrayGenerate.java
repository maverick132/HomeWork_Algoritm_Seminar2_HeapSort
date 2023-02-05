import java.util.ArrayList;
import java.util.Random;

public class ArrayGenerate {
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public void FillArray (int lenghtArray){
        Random rd = new Random();
        for (int i = 0; i < lenghtArray; i++) {
            this.arrayList.add(rd.nextInt(100));
        }
    }

    public void PrintArray() {

        for (Object x: this.arrayList) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
