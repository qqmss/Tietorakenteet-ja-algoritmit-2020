package hashtable;

import java.util.Arrays;

public class HashTable {
    private String[] strings = new String[101];

    public void add(String s) {
        int hash = Math.abs(s.hashCode()) % strings.length;
        int start = hash;
        if (strings[hash] == null) {
            strings[hash] = s;
        } else {
            hash++;
            while (strings[hash % strings.length] != null && !strings[hash].equals(s) && hash % strings.length != start) {
                hash++;
            }
            if (strings[hash] == null) {
                strings[hash] = s;
            }
        }
    }

    public String find(String s) {
        int hash = Math.abs(s.hashCode()) % strings.length;
        int start = hash;
        if(strings[hash] == null){
            return null;
        }
        do {
            if (strings[hash % strings.length].equals(s)) {
                return strings[hash % strings.length];
            }
            hash++;
        } while (strings[hash % strings.length] != null && hash % strings.length != start);
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(strings);
    }
}
