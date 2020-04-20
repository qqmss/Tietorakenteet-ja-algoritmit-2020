package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack {

    private LinkedList<String> list;

    public Stack() {
        list = new LinkedList<>();
    }

    public void push(String data){
        list.offerLast(data);
    }

    public String pop(){
        return list.pollLast();
    }

    public Iterator<String> iterator(){
        return list.iterator();
    }
}
