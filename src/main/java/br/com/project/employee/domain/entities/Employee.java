package br.com.project.employee.domain.entities;

import br.com.project.employee.domain.entities.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private Date dateOfBirth;
    private Gender gender;
    private String cpf;
    private String rg;
    private Address address;
    private Contact contact;
    private ProfessionalInformation professionalInformation;
    private HiringInformation hiringInformation;
    private BankingInformation bankingInformation;
    private AdditionalData additionalData;
}
