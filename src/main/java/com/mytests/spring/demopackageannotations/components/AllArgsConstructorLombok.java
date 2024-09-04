package com.mytests.spring.demopackageannotations.components;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AllArgsConstructorLombok {

    // no `@NonNullFields fields must be initialized` error
    String id;
}
