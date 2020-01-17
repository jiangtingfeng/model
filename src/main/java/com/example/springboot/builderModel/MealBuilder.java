package com.example.springboot.builderModel;

/**
 * @Author: jiangtingfeng
 * @Description: 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 * 套餐生成类
 * @Date :Create in 15:37 2020/1/16
 */
public class MealBuilder {
    /*
    1.素菜汉堡加可口可乐
    * */
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    /*
    2.肌肉堡加百事可乐
    * */
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    /*
    2.肌肉堡加百事可乐
    * */
    public Meal prepareChickenMeal() {
        Meal meal = prepareNonVegMeal();
        meal.addItem(new ChickenAll());
        meal.addItem(new ChickenLeg());
        meal.addItem(new ChickenMeat());
        meal.addItem(new ChickenTeg());
        return meal;
    }

}
