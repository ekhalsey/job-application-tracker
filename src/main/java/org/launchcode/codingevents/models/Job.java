package org.launchcode.codingevents.models;

import org.hibernate.validator.constraints.URL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Job {
    @Id
    @GeneratedValue
    private int id;

    @Size(min = 3, message = "title must be at least 3 characters")
    @NotBlank
    private String jobTitle;

    private String employer;
    private String contactName;

    @Email(message = "enter valid email")
    private String contactEmail;

    @URL(message = "must be a URL")
    private String link;
    private String notes;

    private StatusEnum applicationStatus;

    public Job() {}

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

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
