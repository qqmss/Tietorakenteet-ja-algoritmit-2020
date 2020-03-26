package stackiterator;

public class StackIterator implements Iterator {

    private int current;
    private ListItem[] container;

    public StackIterator(ListItem[] array, int top) {
        this.current = top;
        this.container = array;
    }

    @Override
    public boolean hasNext() {
        return current > 0;
    }

    @Override
    public ListItem next() {
        current--;
        return container[current];
    }
}
