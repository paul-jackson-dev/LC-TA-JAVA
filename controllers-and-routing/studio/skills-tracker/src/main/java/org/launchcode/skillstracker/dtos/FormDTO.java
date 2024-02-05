package org.launchcode.skillstracker.dtos;

public class FormDTO {

    private String name;
    private String favone;
    private String favtwo;
    private String favthree;

    public void setName(String name) {
        this.name = name;
    }

    public void setFavone(String favone) {
        this.favone = favone;
    }

    public void setFavtwo(String favtwo) {
        this.favtwo = favtwo;
    }

    public void setFavthree(String favthree) {
        this.favthree = favthree;
    }

    public String getName() {
        return name;
    }

    public String getFavone() {
        return favone;
    }

    public String getFavtwo() {
        return favtwo;
    }

    public String getFavthree() {
        return favthree;
    }
}
