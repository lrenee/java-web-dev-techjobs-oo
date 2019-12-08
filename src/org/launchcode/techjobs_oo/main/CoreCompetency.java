package org.launchcode.techjobs_oo.main;

import java.util.Objects;

public class CoreCompetency {
    private int id;
    private static int nextId = 1;
    private String value;
    private String notAvailable = "Data not available";

    public CoreCompetency() {
        this.id = nextId;
        nextId++;
    }

    public CoreCompetency(String aValue) {
        this();
        this.value = aValue;
    }


    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.


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

    public int getId() {
        return id;
    }

}
