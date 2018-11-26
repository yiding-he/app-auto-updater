package com.hyd.appautoupdater;

@FunctionalInterface
public interface VersionChecker {

    String getVersion() throws Exception;
}
