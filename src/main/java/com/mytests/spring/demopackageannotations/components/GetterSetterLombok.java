package com.mytests.spring.demopackageannotations.components;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class GetterSetterLombok {

    // no `@NonNullFields fields must be initialized` error
    String id;


}
