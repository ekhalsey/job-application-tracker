package org.launchcode.codingevents.models;

public enum StatusEnum {
    APPLIED("Applied"),
    TOAPPLY("To Apply to"),
    REJECTED("Rejected/Ghosted"),
    INTERVIEW("Interview");

    private final String displayName;
    StatusEnum(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
