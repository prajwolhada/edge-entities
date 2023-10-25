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
@Table(name = "KEY_ACCESS_MODE")
public class KeyAccessMode implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "NAME", length = 20)
    private String name;
    @Column(name = "ABBREVIATION")
    private String abbreviation;

    public KeyAccessMode() {
    }

    public KeyAccessMode(Long id) {
        this.id = id;
    }
}