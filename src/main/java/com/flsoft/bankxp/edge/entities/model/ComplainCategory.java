package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author prashant.adhikari
 */
@Getter
@Setter
@Entity
@Table(name = "COMPLAIN_CATEGORY")
public class ComplainCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, precision = 19, scale = 0)
    private Long id;
    @Column(name = "NAME", length = 50)
    private String name;
    @Column(name = "DEFAULT_OPTION", length = 50)
    private String defaultOption;
    @Column(name = "DESCRIPTION", length = 200)
    private String description;
    @Column(name = "EMAIL", length = 100)
    private String email;

    public ComplainCategory(Long id) {
        this.id = id;
    }

    public ComplainCategory() {
    }

}
