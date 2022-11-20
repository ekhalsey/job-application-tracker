package org.launchcode.codingevents.models;

public enum StatusEnum {
    TOAPPLY("Need To Apply :O"),
    APPLIED("Applied :)"),
    REJECTED("Rejected/Ghosted :("),
    INTERVIEW("Interview :D"),
    APPINPROGRESS("Application in progress :P");

    private final String displayName;
    StatusEnum(String displayName) {
        this.displayName = displayName;
    }


    public String getDisplayName() {
        return displayName;
    }
}
