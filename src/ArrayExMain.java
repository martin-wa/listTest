import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wayne on 11/18/2017.
 */
public class ArrayExMain {
    public static void main (String args []){
/*      ArrayListEx ex1 = new ArrayListEx();
        System.out.println();
        //List numList
        System.out.println(numList);
        System.out.println();*/
        ArrayExMain aem = new ArrayExMain();
        aem.printList(aem.getList()); //prints [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] to the console
        aem.managerList(); //prints [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] to the console

    }
    public void managerList(){
        List numberList = getList();
        //ArrayList numberList = getList();
        numberList.set(0,"8"); //the 'set' function works here only on existing indexes
        numberList.add(8,"0"); //the 'add' function works here
        printList(numberList);
    }
    public void printList(List numbers){
        numbers.remove(8); //the 'remove' function works here
        numbers.set(3,"apple"); //the 'set' function works here
        System.out.println(numbers);
    }
    public List getList(){
        List numberList = new ArrayList();
        for (int i = 0; i <10; i++){
            numberList.add(i);
            //numberList.remove(8); //throws java.lang.IndexOutOfBoundsException
            //numberList.set(3,"8"); //throws java.lang.IndexOutOfBoundsException
        }
        return numberList;
    }
}
