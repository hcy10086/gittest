package com.example.demo;

public class bean {
    String name;
    String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        //test
        
        //
        //
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "bean{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
