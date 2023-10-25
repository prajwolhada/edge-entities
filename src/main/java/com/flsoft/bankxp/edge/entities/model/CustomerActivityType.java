package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author sameep.parajuli
 */
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_ACTIVITY_TYPE")
public class CustomerActivityType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "DESCRIPTION")
    private String desc;
    @Column(name = "IDENTIFIER")
    private String identifier;
    @Column(name = "TYPE")
    private String type;
    @JoinColumn(name = "CUSTOMER_ACTIVITY_TYPE_PARENT_ID", referencedColumnName = "ID")
    @ManyToOne()
    private CustomerActivityTypeParent customerActivityTypeParent;
    @Column(name = "IS_VISIBLE")
    private Character isVisible;

}
