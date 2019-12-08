package org.launchcode.techjobs_oo.main;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private String notAvailable = "Data not available";
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

    @Override
    public String toString() {
        if(this.name == null && this.employer == null && this.location == null && this.positionType == null && this.coreCompetency == null) {
            return "\nOOPS!  This job does not seem to exist.\n";
        } else
        if (this.getName().equals("Data not available") && this.employer.toString().equals("Data not available") && this.location.toString().equals("Data not available") && this.positionType.toString().equals("Data not available") && this.coreCompetency.toString().equals("Data not available")) {
            return "\nOOPS!  This job does not seem to exist.\n";
        } else {
            return "\nID: " + this.id + "\nName: " + this.getName() + "\nEmployer: " + this.employer + "\nLocation: " + this.location + "\nPosition Type: " + this.positionType + "\nCore Competency: " + this.coreCompetency + "\n";
        }
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        if (name == "") {
            return notAvailable;
        } else {
            return name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

   public int getId() {
        return id;
   }

}
