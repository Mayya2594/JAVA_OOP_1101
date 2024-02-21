package Lesson_7.Exp002;

import java.util.UUID;

public class Program {
    
    public static void main(String[] args) {
        
        Worker w = new Worker(28, "firstName", "lastName", 29, 10000);

        ParametrizedWorker<Integer> w1 = new ParametrizedWorker<Integer>(1990, "firstName", "lastName", 20, 5000);
        //System.out.println(w1.getId());
    
        String uid = UUID.randomUUID().toString();
        ParametrizedWorker<String> w2 = new ParametrizedWorker<String>(uid, "firstName", "lastName", 25, 8000);
        //System.out.println(w2.getId());
    
        // #region MultiParameterized
        MultiParameterized<Integer, Double, String> mp1 = new MultiParameterized<>(
                1, 2.0, "3.0");
        System.out.println(mp1);

        MultiParameterized<String, String, String> mp2 = new MultiParameterized<>(
                "1", "2.0", "3.0");
        System.out.println(mp2);

        // #endregion
    
    }
}
