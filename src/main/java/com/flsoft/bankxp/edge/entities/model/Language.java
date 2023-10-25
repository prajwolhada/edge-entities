package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Dilip Mandal
 */
@Getter
@Setter
@Entity
@Table(name = "LANGUAGE")
public class Language implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = true, precision = 20)
    private Long id;
    @Column(name = "ACTIVE", nullable = true)
    private char active;
    @Basic(optional = false)
    @Column(name = "CODE", nullable = false, length = 20)
    private String code;
    @Basic(optional = false)
    @Column(name = "NAME", nullable = false, length = 225)
    private String name;
    @Basic(optional = false)
    @Column(name = "TRANSLATE", nullable = false, length = 225)
    private String translate;
    @Basic(optional = false)
    @Column(name = "ICON", nullable = true, length = 225)
    private String icon;
}
