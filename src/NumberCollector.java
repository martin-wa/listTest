/**
 * Created by Wayne on 11/19/2017.
 *
 * Cognizant training - Hands-on Exercise Objective
 * After completing the hands-on exercises, you will be able to:
 * Develop programs using ArrayList
 */
import java.util.ArrayList;
import java.util.Iterator;

public class NumberCollector {
    public static ArrayList<Integer> numbers;
    //ArrayList<StudentCollection> arrayList = new ArrayList<StudentCollection>();
    public ArrayList<Integer> storeEvenNumbers(int N) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        int size = N;
        int[] list = new int[size];
        for (int i = 2; i <=size; i++) {
            A1.add(i);
        }
        numbers = A1;
        return (A1);
    }

    //public printEvenNumbers()
    public ArrayList<Integer> printEvenNumbers(){
        ArrayList<Integer> A2 = numbers;
        for (int i=0; i < A2.size(); i++) {
            //A2.set(i,i*2);
            //A2.set(1,(A2.get((1)*2))); //result = index # x 2
            //A2.set(1,A2.get((1)*2)); //result = index # x 2
            //int n = A2.get(i);
            //A2.set(i,n*2);
            A2.set(i, (A2.get(i) * 2)); //IndexOutOfBoundsException from -> i <= A2.size()
            int m = 5;
        }
        return(A2);
    }

    //search arrayList
    public int retrieveEvenNumber(int N){
        int num = N;
        int result;
        if (numbers.contains(num)){
            result = num;
            System.out.print("Number is present: ");
        }
        else {
            result = 0;
            System.out.print("Number not present: ");
        }
        return result;
    }

    public static void main (String args[]){
        NumberCollector nc = new NumberCollector();
        ArrayList<Integer> thisList = nc.storeEvenNumbers(21);
        Iterator<Integer> itr = thisList.iterator();
        //while(itr.hasNext()){
            //System.out.println(itr.next());
        //}
        System.out.println(thisList);
        System.out.println(nc.retrieveEvenNumber(18));
        System.out.println(nc.printEvenNumbers());
    }
}
