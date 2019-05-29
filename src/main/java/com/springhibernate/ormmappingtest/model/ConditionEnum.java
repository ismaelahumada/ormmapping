package com.springhibernate.ormmappingtest.model;

public enum ConditionEnum {
    REGULAR("REGULAR"),
    REMOTE("REMOTE"),
    FREE("FREE");
    private String value;

    ConditionEnum(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
