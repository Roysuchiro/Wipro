package DAY_6;
// Hashmap
// Write a java program to remove an element from the Map, you can use the remove() method. This method takes the key value and

// removes the mapping for a key from this map if it is present in the map.

// Instruction- before running the program , give 4 string inputs and then the one  integer number which key you want to remove.
// keys should start from 1.

// Output- 
// Mappings of HashMap are : {1=sakshi, 2=kiran, 3=prashant, 4=kevon}
// Mappings after removal are : {1=sakshi, 2=kiran, 3=prashant}

import java.util.*;

public class question_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();

        // Read 4 string inputs
        for (int i = 1; i <= 4; i++) {
            String value = s.next();
            map.put(i, value);
        }

        // Read the integer key to remove
        int keyToRemove = s.nextInt();

        System.out.println("Mappings of HashMap are : " + map);

        map.remove(keyToRemove);

        System.out.println("Mappings after removal are : " + map);

        s.close();
    }
}