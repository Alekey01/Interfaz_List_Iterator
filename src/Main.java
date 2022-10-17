import uaslp.objetos.list.List.ArrayList.ArrayList;
import uaslp.objetos.list.List.LinkedList.LinkedList;
import uaslp.objetos.list.List.List;
import uaslp.objetos.list.List.Iterator;

public class Main {
    public static void main(String[] args){

        List linkedList = new LinkedList();
        List arrayList = new ArrayList();

        linkedList.addAtFront("Pedro");
        linkedList.addAtFront("Juan");
        linkedList.addAtTail("Pepe");
        linkedList.addAtTail("Miguel");

        arrayList.addAtFront("5");
        arrayList.addAtFront("4");
        arrayList.addAtTail("20");
        arrayList.addAtTail("40");

        Iterator iteratorLinked = linkedList.getIterator();
        Iterator iteratorArray = arrayList.getIterator();

        while(iteratorLinked.hasNext()){
            System.out.println(iteratorLinked.next());
        }

        System.out.println("");
        while( iteratorArray.hasNext()){
            System.out.println(iteratorArray.next());
        }

        System.out.println("getAt(linked): " + linkedList.getAt(1));
        System.out.println("getAt(array): " + arrayList.getAt(1));

        linkedList.remove(2);
        arrayList.remove(3);

        iteratorLinked = linkedList.getIterator();
        iteratorArray = arrayList.getIterator();

        System.out.println("");

        while(iteratorLinked.hasNext()){
            System.out.println(iteratorLinked.next());
        }

        System.out.println("");
        while( iteratorArray.hasNext()){
            System.out.println(iteratorArray.next());
        }

        linkedList.removeAll();
        arrayList.removeAll();
    }
}
