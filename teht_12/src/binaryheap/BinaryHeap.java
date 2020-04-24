package binaryheap;

public class BinaryHeap {

    int size;
    int[] array;

    public BinaryHeap() {
        size = 0;
        array = new int[100];
    }

    private int parentIndex(int index){
        return (index - 1) / 2;
    }

    private int childIndex(int index, int childNum){
        return 2 * index + childNum;
    }

    private void swap(int i, int j){
        int holder = array[i];
        array[i] = array[j];
        array[j] = holder;
    }

    public void insert(int in){
        array[size] = in;
        size++;
        int inIndex = size - 1;
        while (inIndex != 0 && array[parentIndex(inIndex)] > array[inIndex]){
            swap(inIndex, parentIndex(inIndex));
            inIndex = parentIndex(inIndex);
        }
    }

    public void deleteMin(){
        if(size > 0) {
            swap(0, size - 1);
            size--;
            int index = 0;
            boolean done = false;
            //childIndex(index, 1) < childIndex(index, 2)
            while (!done) {
                if (childIndex(index, 2) < size - 1) {
                    int smaller = array[childIndex(index, 1)] < array[childIndex(index, 2)] ? childIndex(index, 1) : childIndex(index, 2);
                    if (array[index] > array[smaller]) {
                        swap(index, smaller);
                        index = smaller;
                    } else {
                        done = true;
                    }
                } else if (childIndex(index, 1) < size - 1) {
                    if (array[index] > array[childIndex(index, 1)]) {
                        swap(index, childIndex(index, 1));
                        index = childIndex(index, 1);
                    } else {
                        done = true;
                    }
                } else {
                    done = true;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int j = 0;
        for(int i = 0; j < size ; i++){
            int start = j;
            for(; j < Math.pow(2,i) + start && j < size; ++j){
                builder.append(array[j] + " ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
