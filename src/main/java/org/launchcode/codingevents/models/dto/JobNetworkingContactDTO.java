package org.launchcode.codingevents.models.dto;

import org.launchcode.codingevents.models.Job;
import org.launchcode.codingevents.models.NetworkingContact;

import javax.validation.constraints.NotNull;

public class JobNetworkingContactDTO {
    @NotNull
    private Job job;

    @NotNull
    private NetworkingContact contact;

    public JobNetworkingContactDTO() {}

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public NetworkingContact getContact() {
        return contact;
    }

    public void setContact(NetworkingContact contact) {
        this.contact = contact;
    }
}
