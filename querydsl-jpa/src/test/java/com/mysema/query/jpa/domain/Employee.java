/*
 * Copyright (c) 2010 Mysema Ltd.
 * All rights reserved.
 *
 */
package com.mysema.query.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * The Class Employee.
 */
@Entity
public class Employee {
    @ManyToOne
    Company company;

    @OneToOne
    User user;
    
    String firstName, lastName;

    @Id
    int id;
}
