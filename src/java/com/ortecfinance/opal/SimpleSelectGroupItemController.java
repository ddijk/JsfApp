package com.ortecfinance.opal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
import javax.inject.Named;
import org.omnifaces.cdi.ViewScoped;

@Named
@ViewScoped
public class SimpleSelectGroupItemController implements Serializable {

    String description;

    String selectedCategory;

    private List<SelectItem> availableItems;

    @PostConstruct
    public void init() {
        availableItems = new ArrayList<SelectItem>();

        SelectItemGroup group1 = new SelectItemGroup("Group 1");
        group1.setSelectItems(new SelectItem[]{
            new SelectItem("Group 1 Value 1", "Group 1 Label 1"),
            new SelectItem("Group 1 Value 2", "Group 1 Label 2"),
            new SelectItem("Group 1 Value 3", "Group 1 Label 3")
        });
        availableItems.add(group1);

        SelectItemGroup group2 = new SelectItemGroup("Group 2");
        group2.setSelectItems(new SelectItem[]{
            new SelectItem("Group 2 Value 1", "Group 2 Label 1"),
            new SelectItem("Group 2 Value 2", "Group 2 Label 2"),
            new SelectItem("Group 2 Value 3", "Group 2 Label 3")
        });
        availableItems.add(group2);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSelectedCategory() {
        return selectedCategory;
    }

    public void setSelectedCategory(String selectedCategory) {
        this.selectedCategory = selectedCategory;
    }

    public List<SelectItem> getAvailableItems() {
        return availableItems;
    }

    public String submit() {
        System.out.println("Submit called. Selected " + selectedCategory);
        return "index2";
    }

}
