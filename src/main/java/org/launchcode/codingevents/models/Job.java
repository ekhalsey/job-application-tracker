package org.launchcode.codingevents.models;

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

    @Email
    private String contactEmail;
    private String source;

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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public StatusEnum getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(StatusEnum applicationStatus) {
        this.applicationStatus = applicationStatus;
    }
}
