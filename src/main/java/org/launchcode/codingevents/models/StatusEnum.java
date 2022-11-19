package org.launchcode.codingevents.models;

public enum StatusEnum {
    TOAPPLY("To apply to"),
    APPLIED("Applied"),
    REJECTED("Rejected/Ghosted"),
    INTERVIEW("Interview"),
    APPINPROGRESS("Application in progress");

    private final String displayName;
    StatusEnum(String displayName) {
        this.displayName = displayName;
    }


    public String getDisplayName() {
        return displayName;
    }
}
