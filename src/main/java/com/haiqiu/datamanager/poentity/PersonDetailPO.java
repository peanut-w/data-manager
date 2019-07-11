package com.haiqiu.datamanager.poentity;

public class PersonDetailPO {
    private Integer id;

    private Integer shoesize;

    private String preferredSide;

    private String birthPlace;

    private Integer birthCountryId;

    private String position1;

    private String position2;

    private String died;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShoesize() {
        return shoesize;
    }

    public void setShoesize(Integer shoesize) {
        this.shoesize = shoesize;
    }

    public String getPreferredSide() {
        return preferredSide;
    }

    public void setPreferredSide(String preferredSide) {
        this.preferredSide = preferredSide == null ? null : preferredSide.trim();
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace == null ? null : birthPlace.trim();
    }

    public Integer getBirthCountryId() {
        return birthCountryId;
    }

    public void setBirthCountryId(Integer birthCountryId) {
        this.birthCountryId = birthCountryId;
    }

    public String getPosition1() {
        return position1;
    }

    public void setPosition1(String position1) {
        this.position1 = position1 == null ? null : position1.trim();
    }

    public String getPosition2() {
        return position2;
    }

    public void setPosition2(String position2) {
        this.position2 = position2 == null ? null : position2.trim();
    }

    public String getDied() {
        return died;
    }

    public void setDied(String died) {
        this.died = died == null ? null : died.trim();
    }
}
