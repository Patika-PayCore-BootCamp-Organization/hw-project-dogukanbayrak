package com.patika.paycore.test.model;

import java.io.Serializable;

public class Cinema  {

    private String name;

    public Cinema() {
    }

    public Cinema(String name) {        this.name = name;    }

    public String getName() {        return name;    }

    public void setName(String name) {        this.name = name;    }
}
