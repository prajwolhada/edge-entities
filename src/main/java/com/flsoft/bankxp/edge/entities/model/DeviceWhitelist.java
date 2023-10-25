package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author sandhya.pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "DEVICE_WHITELIST")
public class DeviceWhitelist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;

    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;

    @Column(name = "ACTIVE")
    private char active;

}
