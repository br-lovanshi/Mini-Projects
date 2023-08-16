package com.Inheritance.Mapping.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@DiscriminatorValue("contract_employee")
//@AttributeOverrides({
//        @AttributeOverride(name = "id", column = @Column(name = "id")),
//        @AttributeOverride(name = "name", column = @Column(name = "name"))
//})
@PrimaryKeyJoinColumn(name = "ID")
public class ContractEmployee extends Employee{

    private Integer wages_per_hour;

    private Integer hours_worked;
}
