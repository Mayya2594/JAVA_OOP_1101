package Lesson_7.Exp001;

import java.util.ArrayList;
import java.util.List;

public class Program {
    
    public static void main(String[] args) {
        
        List list = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            list.add(String.format("string %d", i));
        }

        System.out.println(list);
        //System.out.println(allLength(list));

        list.add(123);
        System.out.println(list);
    }


}
