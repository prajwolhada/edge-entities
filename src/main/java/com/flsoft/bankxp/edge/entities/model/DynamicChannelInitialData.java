package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author srijan
 */
@Getter
@Setter
@Entity
@Table(name = "DYNAMIC_CHANNEL_INITIAL_DATA")
public class DynamicChannelInitialData implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;

    @Column(name = "DATA_LABEL")
    private String dataLabel;

    @Column(name = "DATA_VALUE")
    private String dataValue;

    @Column(name = "DATA_SEPARATOR")
    private String dataSeparator;

    @Column(name = "ACTIVE")
    private char active;

    @Column(name = "CHANNEL")
    private String channel;
}