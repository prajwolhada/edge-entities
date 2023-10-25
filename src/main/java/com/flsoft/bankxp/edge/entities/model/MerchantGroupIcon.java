package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "MERCHANT_GROUP_ICON")
public class MerchantGroupIcon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "PATH")
    private String path;
    @JoinColumn(name = "MERCHANT_GROUP_ID", referencedColumnName = "ID")
    @ManyToOne
    private MerchantGroup merchantGroup;
    @Column(name = "VERSION")
    private String version;
    @Column(name = "TINT")
    private char tint;


}
