package br.com.project.employee.domain.entities.enums;

public enum ContractType {
    CLT,
    PJ,
    INTERN,
    TEMPORARY,
    TRAINEE;


    public static boolean isValidContract(String value) {
        if (value == null) {
            return false;
        }
        for (ContractType contractType : ContractType.values()) {
            if (contractType.name().equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }
}
