package queue;

public class Stack {

    private ListItem top;

    public void push(String data){
        ListItem listItem = new ListItem(data, top);
        top = listItem;
    }

    public void push(ListItem listItem){
        top = listItem;
    }

    public String pop(){
        if (top == null){
            return null;
        } else {
            String data = top.getData();
            top = top.getNext();
            return data;
        }
    }
}
