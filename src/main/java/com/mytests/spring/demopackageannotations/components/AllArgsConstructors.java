package com.mytests.spring.demopackageannotations.components;


public class AllArgsConstructors {

    // `@NonNullFields fields must be initialized` warning is shown
    String id;

    public AllArgsConstructors(String id) {
        this.id = id;
    }

    public AllArgsConstructors() {
    }


}
