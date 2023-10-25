package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author rashim
 */
@Getter
@Setter
@Entity
@Table(name = "EVOUCHER_DOCUMENT")
public class EVoucherDocument implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "EVOUCHER_ID", referencedColumnName = "ID")
    private EVoucher eVoucher;

    @Column(name = "FILE_NAME")
    private String fileName;
}
