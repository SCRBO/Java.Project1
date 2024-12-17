package bsu.rfe.java.group10.lab1.laptsinski.varb2;

import java.util.Comparator;


public class FoodComparator implements Comparator<Food> {
    public int compare(Food arg0, Food arg1) {

        if (arg0==null) return 1;

        if (arg1==null) return -1;

        return Double.compare(((Nutritious) arg0).calculateCalories(), ((Nutritious) arg1).calculateCalories());
    }
}
