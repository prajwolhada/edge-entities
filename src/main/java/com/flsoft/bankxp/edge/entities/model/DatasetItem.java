package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author srijan
 */
@Getter
@Setter
@Entity
@Table(name = "DATASET_ITEM")
public class DatasetItem implements Serializable {

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

    @Column(name = "ACTIVE")
    private char active;

    @Basic(optional = false)
    @JoinColumn(name = "DATASET_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private Dataset dataset;

}
