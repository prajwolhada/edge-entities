package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Administrator
 */
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_ACTIVITY_TYPE_PARENT")
public class CustomerActivityTypeParent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "IDENTIFIER")
    private String identifier;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "TYPE")
    private String type;

    public CustomerActivityTypeParent() {
    }

    public CustomerActivityTypeParent(Long id) {
        this.id = id;
    }
}