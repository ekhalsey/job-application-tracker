package org.launchcode.codingevents.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Job extends AbstractEntity{


    @Size(min = 3, message = "title must be at least 3 characters")
    @NotBlank
    private String jobTitle;


    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @NotNull
    private JobDetails jobDetails;


    public Job() {}

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public JobDetails getJobDetails() {
        return jobDetails;
    }

    public void setJobDetails(JobDetails jobDetails) {
        this.jobDetails = jobDetails;
    }
}
