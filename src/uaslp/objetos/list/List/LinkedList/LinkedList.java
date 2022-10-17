package uaslp.objetos.list.List.LinkedList;
import uaslp.objetos.list.List.List;

public class LinkedList implements List {
    private Node head,tails;
    private int size;

    public LinkedList(){
        head = tails = null;
        size = 0;
    }
    public void addAtTail(String data){
        Node node = new Node(data);

        if(tails == null) head = node;

        else
        {
            node.previous = tails;
            tails.next = node;
            tails = node;
        }
        tails = node;
        size++;
    }
    public void addAtFront(String data){
        Node node = new Node(data);
        if(head == null) tails = node;
        else {
            node.next = head;
            head = node;
        }
        head = node;
        size++;
    }
    public boolean remove(int index) {
        int count = 0;
        if (head != null) {
            Node aux;
            Node prev = null;
            aux = head;
            while (aux != null && count != index) {
                prev = aux;
                aux = aux.next;
                count++;
            }
            if (aux == null) {
                return false;
            } else if (prev == null) {
                head = aux.next;
                size--;
            } else {
                prev.next = aux.next;
                size--;
            }
        }
        return true;

    }


    public void removeAll()
    {
        while(head!=null){
            head=head.next;
        }
        size=0;
    }

    public boolean setAt(int index,String data)
    {
        Node node=head;
        int count=0;
        while (node != null && count != index)
        {
            node= node.next;
            count++;
        }
        if(node !=null) {
            node.setData(data);
            return true;
        }
        return false;
    }

    public String getAt(int index){
        Node node=head;
        int count=0;
        while (node != null && count != index) {
            node= node.next;
            count++;
        }
        if(node !=null){
            String s= node.GetDataNode();
            return String.valueOf(s);
        }
        return null;
    }

    public void removeAllWithValue(String data){
        Node node = head;
        while (node != null)
        {
            if(node.GetDataNode()==data)
            {
                size--;
                Node aux1,aux2;
                aux1=node.previous;
                aux2=node.next;
                if(aux1 != null)
                {
                    aux1.next=aux2;
                }
                else
                {
                    head=aux2;
                }
                if(aux2 !=null)
                {
                    aux2.previous= aux1;
                }
                else
                {
                    tails= aux1;
                }

            }
            node=node.next;
        }
    }
    public int getSize() {
        return size;
    }
    public LinkedListIterator getIterator(){
        return new LinkedListIterator(head);
    }
}