package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author Sabrin Luitel <sabrin.luitel@f1soft.com>
 */
@Getter
@Setter
@Table
@Entity(name = "TELLER_ACCOUNT")
public class TellerAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ACCOUNT_NUMBER")
    private long accountNumber;

}
