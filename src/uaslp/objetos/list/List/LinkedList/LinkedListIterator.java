package uaslp.objetos.list.List.LinkedList;
import uaslp.objetos.list.List.Iterator;

public class LinkedListIterator implements Iterator {
    Node node;

    public LinkedListIterator(Node node){
        this.node = node;
    }
    public boolean hasNext(){
        return node != null;
    }
    public String next(){
        String data = node.GetDataNode();
        node = node.next;
        return data;
    }

}