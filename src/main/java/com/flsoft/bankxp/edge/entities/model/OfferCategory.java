package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

/**
 * @author rashim
 */
@Getter
@Setter
@Entity
@Table(name = "OFFER_CATEGORY")
public class OfferCategory extends AbstractAuditor {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 12)
    private Long id;

    @Column(name = "ACTIVE")
    private Character active;

    @Column(name = "TYPE", nullable = false, length = 30)
    private String type;

    @Column(name = "NAME", nullable = false, length = 30)
    private String name;

    @Column(name = "DESCRIPTION", length = 100)
    private String description;

    @Column(name = "ICON_PATH", nullable = false, length = 30)
    private String iconPath;

    @Column(name = "IS_EDITABLE")
    private Character isEditable;

    @Column(name = "SORT_ORDER")
    private Integer sortOrder;

}
