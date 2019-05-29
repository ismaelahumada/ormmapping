package com.springhibernate.ormmappingtest.persistence.entity;

import com.springhibernate.ormmappingtest.model.ConditionEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Student extends DatabaseObject {
    @Column(name = "first_name")
    private String firstName;

    private String lastName;
    private Integer age;

    @Enumerated(EnumType.STRING)
    @Column(name = "student_condition")
    private ConditionEnum condition;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ConditionEnum getCondition() {
        return condition;
    }

    public void setCondition(ConditionEnum condition) {
        this.condition = condition;
    }
}
