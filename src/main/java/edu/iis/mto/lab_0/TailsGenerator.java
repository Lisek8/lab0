package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList stringsList = new ArrayList<>(value.length());
        for (int i = 0; i <= value.length(); i++) {
            stringsList.add(value.substring(i));
        }
        return stringsList;
    }

}
