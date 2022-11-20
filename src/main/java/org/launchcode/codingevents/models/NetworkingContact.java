package org.launchcode.codingevents.models;

import org.hibernate.validator.constraints.URL;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class NetworkingContact extends AbstractEntity{

    @NotBlank
    private String name;

    @Email(message = "must be a valid email")
    private String email;

    private String company;

    @URL(message = "must be a URL")
    private String linkedIn;

    private String notes;

    @ManyToMany(mappedBy = "contacts")
    private final List<Job> jobs = new ArrayList<>();


    public NetworkingContact() {}

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
