package com.zendev.gakadaobat.model;

import org.json.JSONObject;

public class Food {

    private String strMeal;
    private String strMealThumb;

    public String getStrMeal() {
        return strMeal;
    }

    public String getStrMealThumb() {
        return strMealThumb;
    }

    public Food(JSONObject object) {
        try {
            String strMeal = object.getString("strMeal");
            String strMealThumb = object.getString("strMealThumb");

            this.strMeal = strMeal;
            this.strMealThumb = strMealThumb;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
