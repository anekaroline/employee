package br.com.project.employee.domain.entities.enums;

public enum AccountType {
    CHECKING,
    SAVINGS,
    SALARY;

    public static boolean isValidAccount(String value) {
        if (value == null) {
            return false;
        }
        for (AccountType account : AccountType.values()) {
            if (account.name().equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }
}
