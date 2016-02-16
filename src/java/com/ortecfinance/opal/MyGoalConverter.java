package com.ortecfinance.opal;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "myConv")
public class MyGoalConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        System.out.println("getAsObject " + value);

        int id = Integer.parseInt(value);
        switch (id) {
            case 1:
                return new GoalCategory(1L, "Aap");
            case 10:
                return new GoalCategory(10L, "Noot");
            case 13:
                return new GoalCategory(13L, "MIes");

        }
        /*
         categories.add(new GoalCategory(1L, "Aap"));

        categories.add(new GoalCategory(10L, "Noot"));

        categories.add(new GoalCategory(13L, "MIes"));
         */
        throw new RuntimeException("OOps");
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        System.out.println("getAsString " + value);
        return "" + value;
        // GoalCategory gc = (GoalCategory) value;
        // return gc.getId().toString();
    }

}
