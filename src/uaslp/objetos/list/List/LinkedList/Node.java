package uaslp.objetos.list.List.LinkedList;

public class Node {
    Node next, previous;
    private String data;

    public Node(String data) {
        next = previous = null;
        this.data = data;
    }
    public String GetDataNode() {return data;}
    public void setData(String data) {
        this.data = data;
    }
}