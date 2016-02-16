package com.ortecfinance.opal;

public class GoalCategory {

    String description;
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GoalCategory(Long id, String description) {
        this.description = description;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "GoalCategory{" + "description=" + description + ", id=" + id + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Long) {

            return obj.equals(id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

}
