package com.example.vinh.tutsplusdagger.Models;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Vinh on 3/20/2017.
 */

public class Scenario {
    @Inject
    @Named("scenarioName")
    public String scenarioName;

    @Inject
    public Date date;

    public Scenario() {
    }

    public Scenario(String scenarioName, Date date) {
        this.scenarioName = scenarioName;
        this.date = date;
    }
}
