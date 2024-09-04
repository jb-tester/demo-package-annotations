package com.mytests.spring.demopackageannotations.components;



public class GettersSetters {

    // `@NonNullFields fields must be initialized` warning is shown
    String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }


}
