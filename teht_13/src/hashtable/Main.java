package hashtable;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        List<String> strings = new ArrayList<>(Arrays.asList("ontih", "sueqi", "zture", "kmuef", "sgbar", "pefne",
                "wvisd", "oqwjq", "cxqtd", "haghv", "frhdh", "gcybx", "tzlfr", "wcvxp", "rasmk", "gvgms", "njnqh",
                "lnezy", "jhmks", "radqr", "oticy", "tiysx", "hypbi", "ybfto", "ivhfg"));
        for (String s : strings){
            hashTable.add(s);
        }
        System.out.println(hashTable);
        System.out.println();
        strings.add("eiole");
        for (String s : strings){
            String find = hashTable.find(s);
            if(find != null){
                System.out.println("found: " + s + " = " + find);
            } else {
                System.out.println("no found: " + s);
            }
        }
    }
}
