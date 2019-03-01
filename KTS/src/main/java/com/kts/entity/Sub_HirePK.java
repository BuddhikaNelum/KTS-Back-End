package com.kts.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Sub_HirePK {

    Hire mainHireId;
    Hire subHireId;
}
