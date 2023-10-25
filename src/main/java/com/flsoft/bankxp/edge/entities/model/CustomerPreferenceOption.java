package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Gaurav Regmi
 */
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_PREFERENCE_OPTION")
public class CustomerPreferenceOption implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "DEFAULT_VALUE")
    private String defaultValue;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "CATEGORY_NAME")
    private String categoryName;

    @Column(name = "INPUT_TYPE")
    private String inputType;

    @OneToMany(mappedBy = "customerPreferenceOption", fetch = FetchType.EAGER)
    private List<CustomerPreferenceDatasetItem> customerPreferenceDatasetItemList;

    @Column(name = "ADMIN_EDIT")
    private String adminEdit;

    @Column(name = "CUSTOMER_EDIT")
    private String customerEdit;
}
