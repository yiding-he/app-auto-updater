package com.hyd.appautoupdater;

import java.util.function.Supplier;

public class UrlVersionChecker implements Supplier<String> {

    private String url;

    public UrlVersionChecker(String url) {
        this.url = url;
    }

    @Override
    public String get() {
        return null;
    }
}
