package com.hyd.appautoupdater;

import java.util.function.Supplier;

public class AppUpdater {

    private String currentVersion;

    private VersionChecker versionChecker;

    private int checkIntervalMin;

    public AppUpdater(
            String currentVersion,
            VersionChecker versionChecker,
            int checkIntervalMin
    ) {
        this.currentVersion = currentVersion;
        this.versionChecker = versionChecker;
    }

    public void setCheckIntervalMin(int checkIntervalMin) {
        this.checkIntervalMin = checkIntervalMin;
    }

    public void startService() {

    }
}
