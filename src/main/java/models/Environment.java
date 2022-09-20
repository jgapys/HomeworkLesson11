package models;

import java.util.ArrayList;
import java.util.List;

public class Environment {
    public EnvironmentModel testLogback;
    public EnvironmentModel testSelenium;

    public EnvironmentModel getTestLogback() {
        return testLogback;
    }

    public EnvironmentModel getTestSelenium() {
        return testSelenium;
    }

    public List<EnvironmentModel> getListOfEnvironments() {
        List<EnvironmentModel> listOfEnvironments = new ArrayList<>();
        listOfEnvironments.add(getTestLogback());
        listOfEnvironments.add(getTestSelenium());
        return listOfEnvironments;
    }
}
