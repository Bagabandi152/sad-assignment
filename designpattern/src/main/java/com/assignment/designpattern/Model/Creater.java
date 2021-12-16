package com.assignment.designpattern.Model;

public class Creater {

    private long id;
    private String name;

    public Creater() {
        this.id = Math.decrementExact(1);
        this.name = "";
    }

    public Creater(long id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
