package Lesson_5.Exp002;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Lesson_5.Exp002.ExBeverage.Beans;
import Lesson_5.Exp002.ExBeverage.Beverage;
import Lesson_5.Exp002.ExBeverage.Coffe;
import Lesson_5.Exp002.ExBeverage.Ingredient;
import Lesson_5.Exp002.ExBeverage.Milk;
import Lesson_5.Exp002.ExBeverage.Water;

public class Program {
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);

        Iterator<Integer> iter = nums.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        Worker worker = new Worker("Имя", "Фамилия", 23, 5000);

        Iterator<String> components = worker;

        while(components.hasNext()) {
            System.out.println(worker.next());
        }

        Beverage latte = new Coffe();
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Beans("Зерна"));
        latte.addComponent(new Milk("Молоко"));
        
        Iterator<Ingredient> iterator = latte;

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
