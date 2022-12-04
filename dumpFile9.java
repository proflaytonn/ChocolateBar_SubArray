package dumpFile_Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dumpFile9 {
    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(1,2,1,3,2); // output = 2
//        List<Integer> s = Arrays.asList(1 ,1, 1, 1, 1, 1); //output = 0
        int d = 3; //jumlah sumnya harus 3
        int m = 2; //jumlah digit yg di sum harus 2

//        List<Integer> s = Arrays.asList(4); //output = 1
//        int d = 4;
//        int m = 1;

//        List<Integer> s = Arrays.asList(2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1); //output = 3
//        int d = 18;
//        int m = 7;

        int count = 0;


        if(s.size() == 1 && s.get(0) == d && m == 1)
        {
            count++;
        }
        else {
            for (int i = 0; i < s.size() - m + 1; i++) {
                int sum = 0;
                for (int j = 0; j < m; j++) {
                    sum = sum + s.get(i+j);
                }
                if (sum == d) {
                    count++;
                }
            }
        }
        System.out.println(count);



//        for(int i = 0; i<s.size()-m+1 ; i++) //harusnya 13
//        {
//            count++;
//        }
//        System.out.println(count);
    }
}
