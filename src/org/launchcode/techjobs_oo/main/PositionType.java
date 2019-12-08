package org.launchcode.techjobs_oo.main;

import java.util.Objects;

public class PositionType {
    private int id;
    private static int nextId = 1;
    private String value;
    private String notAvailable = "Data not available";

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String aValue) {
        this();
        this.value = aValue;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    @Override
    public String toString() {
        return getValue();
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        if (value == "") {
            return notAvailable;
        } else {
            return value;
        }
    }

    public void setValue(String value) {
        this.value = value;
    }
}
