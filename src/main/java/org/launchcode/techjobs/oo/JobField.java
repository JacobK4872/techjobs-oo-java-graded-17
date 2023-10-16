package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    public int id;
    public static int nextId = 1;
    public String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        if (value == null || value.isEmpty()) {
            return "Data not available";
        } else {
            return value;
        }
    }

    public void setValue(String value) {
        this.value = value;
    }

}