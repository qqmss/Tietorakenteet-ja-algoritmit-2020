package stack;

public class Stack {

    private ListItem top;

    public void push(String data){
        //Lisää tietue pinon päälle. Lisää linkki uudesta päälimmäisestä vanhaan päälimmäiseen.
        ListItem listItem = new ListItem(data, top);
        top = listItem;
    }

    public String pop(){
        if (top == null){
            return null;
        } else {
            //Palauta päälimmäisin ja aseta seuraavaksi päälimmäisin päälimmäiseksi.
            String data = top.getData();
            top = top.getNext();
            return data;
        }
    }
}
