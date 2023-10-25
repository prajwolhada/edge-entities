package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Gaurav Regmi
 */
@Getter
@Setter
@Entity
@Table(name = "PREFERENCE_CATEGORY")
public class PreferenceCategory implements Serializable {
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ACTIVE")
    private String active;

    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;
}
