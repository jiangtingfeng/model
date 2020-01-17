package com.example.springboot.builderModel;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 15:41 2020/1/16
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost:" + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost:" +nonVegMeal.getCost());


        Meal chickenMeal = mealBuilder.prepareChickenMeal();
        System.out.println("Chicken Meal");
        chickenMeal.showItems();
        System.out.println("Total Cost:" +chickenMeal.getCost());

    }
}
