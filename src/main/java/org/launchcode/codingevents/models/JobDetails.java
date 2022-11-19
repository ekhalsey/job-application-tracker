package org.launchcode.codingevents.models;

import org.hibernate.validator.constraints.URL;

import javax.persistence.Entity;
import javax.validation.constraints.Email;

@Entity
public class JobDetails extends AbstractEntity{
    //date

    private String employer;
    private String contactName;
    @Email(message = "enter valid email")
    private String contactEmail;
    @URL(message = "must be a URL")
    private String link;
    private String notes;
    private StatusEnum applicationStatus;

    public JobDetails() {}

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    public StatusEnum getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(StatusEnum applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}

