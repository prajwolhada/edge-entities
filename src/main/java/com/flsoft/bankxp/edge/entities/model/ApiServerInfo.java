package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author sandhya.pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "API_SERVER_INFO")
public class ApiServerInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "CONFIG_KEY", length = 255)
    private String configKey;
    @Column(name = "CONFIG_VALUE", length = 255)
    private String configValue;
    @Column(name = "DESCRIPTION", length = 255)
    private String description;
    @Column(name = "ACTIVE", length = 1)
    private Character active;

}
