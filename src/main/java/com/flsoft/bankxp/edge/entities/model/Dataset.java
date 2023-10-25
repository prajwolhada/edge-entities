package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author srijan
 */
@Getter
@Setter
@Entity
@Table(name = "DATASET")
public class Dataset implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;

    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;

    @Column(name = "CODE")
    private String code;

    @Column(name = "ACTIVE")
    private char active;

    @Basic(optional = false)
    @OneToMany(mappedBy = "dataset", fetch = FetchType.EAGER)
    private List<DatasetItem> datasetItems;
}
