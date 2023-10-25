package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author root
 */
@Getter
@Setter
@Entity
@Table(name = "SERVICE_PROVIDER")
public class ServiceProvider implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "CODE", nullable = false, length = 10)
    private String code;
    @Basic(optional = false)
    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    public ServiceProvider() {
    }

    public ServiceProvider(Long id) {
        this.id = id;
    }
}