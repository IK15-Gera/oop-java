package de.benklett;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Eine Klasse
 */
public class Person {
    private String name;
    private int gebJahr;

    /**
     * Der Konstruktor
     * @param name Der Name der Person
     * @param gebJahr Das Geburtsjahr der Person
     */
    public Person(String name, int gebJahr) {
        this.name = name;
        this.gebJahr = gebJahr;
    }

    /**
     * Berechnet das Alter
     * @return das Alter
     */
    public int alter() {
        Date dNow = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");

        int currentYear = Integer.parseInt(dateFormat.format(dNow));

        return currentYear - gebJahr;
    }
}
