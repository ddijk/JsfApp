package com.ortecfinance.opal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import org.omnifaces.cdi.ViewScoped;

@Named(value = "bean")
@ViewScoped
public class GoalCategoryController implements Serializable {

    List<GoalCategory> categories = new ArrayList<>();

    GoalCategory selectedCategory;

    @PostConstruct
    public void init() {
        categories.add(new GoalCategory(1L, "Aap"));

        categories.add(new GoalCategory(10L, "Noot"));

        categories.add(new GoalCategory(13L, "MIes"));
    }

    public List<GoalCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<GoalCategory> categories) {
        this.categories = categories;
    }

    public GoalCategory getSelectedCategory() {
        return selectedCategory;
    }

    public void setSelectedCategory(GoalCategory selectedCategory) {
        this.selectedCategory = selectedCategory;
    }

    public void handleSelection() {
        System.out.println("handleSelection .. " + selectedCategory);
    }

}
