package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;


/**
 * @author Narayan
 */
@Getter
@Setter
@Entity
@Table(name = "BANK_SWIFT_CODE")
public class BankSwiftCode implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "CODE", nullable = false, length = 15)
    private String Code;
    @Basic(optional = false)
    @Column(name = "BANK_NAME", nullable = false, length = 150)
    private String bankName;

}
