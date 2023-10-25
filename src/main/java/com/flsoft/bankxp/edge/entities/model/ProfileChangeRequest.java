package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author rashim
 */
@Getter
@Setter
@Entity
@Table(name = "PROFILE_CHANGE_REQUEST")
public class ProfileChangeRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "TYPE", nullable = false)
    private String userType;

    @Column(name = "REMARKS")
    private String remakrs;

    @Column(name = "REQUESTED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestedDate;

    @Column(name = "STATUS", nullable = false, length = 20)
    private String status;

    @Column(name = "TXN_STATUS", length = 20)
    private String txnStatus;

    @JoinColumn(name = "OLD_PROFILE_ID", referencedColumnName = "ID", nullable = true)
    @OneToOne()
    private Profile oldProfile;

    @JoinColumn(name = "NEW_PROFILE_ID", referencedColumnName = "ID", nullable = false)
    @OneToOne()
    private Profile newProfile;

    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID")
    @ManyToOne()
    private CustomerLogin customerLogin;
}
