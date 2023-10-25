package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author prajwol.hada
 */
@Getter
@Setter
@Entity
@Table(name = "PRIMARY_ACCOUNT_CHANGE_LOG")
public class PrimaryAccountChangeLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "RECORDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "CUSTOMER_LOGIN_ID")
    private Long customerLoginId;
    @Column(name = "NEW_ACCOUNT")
    private String newAccount;
    @Column(name = "OLD_ACCOUNT")
    private String oldAccount;

}
