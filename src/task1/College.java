package task1;

import java.time.LocalDate;

public class College extends EducationCenter{ // is a
    public College() {
    }

    public College(String name, String locatedCountry, LocalDate foundationDate) {
        super(name, locatedCountry, foundationDate);
    }
}
