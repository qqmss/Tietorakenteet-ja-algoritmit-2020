package stackiterator;

public class Stack {

    private int top = 0;
    private ListItem[] array = new ListItem[10];

    public void push(String data){
        array[top] = new ListItem(data);
        top++;
    }

    public String pop(){
        if (top <= 0){
            return null;
        } else {
            top--;
            return array[top].getData();
        }
    }

    public StackIterator iterator() {
        return new StackIterator(array, top);
    }
}
