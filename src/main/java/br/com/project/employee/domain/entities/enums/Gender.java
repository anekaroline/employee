package br.com.project.employee.domain.entities.enums;

import lombok.Getter;

@Getter
public enum Gender {
    FEMALE,
    MALE,
    OTHER;

    public static boolean isValidGender(String value) {
        if (value == null) {
            return false;
        }
        for (Gender gender : Gender.values()) {
            if (gender.name().equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }
}
