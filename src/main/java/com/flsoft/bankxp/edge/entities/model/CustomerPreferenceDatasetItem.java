package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

/**
 * @author Gaurav Regmi
 */
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_PREFERENCE_DATASET_ITEM")
public class CustomerPreferenceDatasetItem {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DATA_LABEL")
    private String dataLabel;

    @Column(name = "DATA_VALUE")
    private String dataValue;

    @Column(name = "ACTIVE")
    private char active;

    @JoinColumn(name = "CUSTOMER_PREFERENCE_OPTION_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private CustomerPreferenceOption customerPreferenceOption;


}
