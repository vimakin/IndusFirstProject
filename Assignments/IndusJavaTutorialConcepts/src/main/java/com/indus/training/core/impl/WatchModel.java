package com.indus.training.core.impl;

import com.indus.training.core.domain.WatchInput;

public class WatchModel {
    private WatchInput watchInput;

    public WatchModel(WatchInput watchInput) {
        this.watchInput = watchInput;
    }

    public WatchInput getWatchInput() {
        return watchInput;
    }

    public void setWatchInput(WatchInput watchInput) {
        this.watchInput = watchInput;
    }
}
