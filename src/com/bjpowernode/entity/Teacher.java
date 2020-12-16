package com.bjpowernode.entity;

public class Teacher {

    private Integer teaId;

    private String teaName;

    private Integer teaAge;

    private Integer teaAgeBegin;
    private Integer teaAgeEnd;

    private String teaSex;

    private Integer teaDate;

    private String teaDateBegin;

    private String teaDateEnd;


    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    public Integer getTeaAge() {
        return teaAge;
    }

    public void setTeaAge(Integer teaAge) {
        this.teaAge = teaAge;
    }

    public String getTeaSex() {
        return teaSex;
    }

    public void setTeaSex(String teaSex) {
        this.teaSex = teaSex == null ? null : teaSex.trim();
    }


    public Integer getTeaAgeBegin() {
        return teaAgeBegin;
    }

    public void setTeaAgeBegin(Integer teaAgeBegin) {
        this.teaAgeBegin = teaAgeBegin;
    }

    public Integer getTeaAgeEnd() {
        return teaAgeEnd;
    }

    public void setTeaAgeEnd(Integer teaAgeEnd) {
        this.teaAgeEnd = teaAgeEnd;
    }

    public Integer getTeaDate() {
        return teaDate;
    }

    public void setTeaDate(Integer teaDate) {
        this.teaDate = teaDate;
    }

    public String getTeaDateBegin() {
        return teaDateBegin;
    }

    public void setTeaDateBegin(String teaDateBegin) {
        this.teaDateBegin = teaDateBegin;
    }

    public String getTeaDateEnd() {
        return teaDateEnd;
    }

    public void setTeaDateEnd(String teaDateEnd) {
        this.teaDateEnd = teaDateEnd;
    }
}