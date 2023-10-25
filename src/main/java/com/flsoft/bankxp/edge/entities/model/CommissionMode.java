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
@Table(name = "COMMISSION_MODE")
public class CommissionMode implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false)
    private Character active;
    @Basic(optional = false)
    @Column(name = "NAME", length = 80)
    private String name;
    @Basic(optional = false)
    @Column(name = "CODE", length = 10)
    private String code;

}
