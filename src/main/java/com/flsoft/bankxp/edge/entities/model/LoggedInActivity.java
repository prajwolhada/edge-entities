package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "LOGGED_IN_ACTIVITY")
public class LoggedInActivity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "ACTIVITY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date activityDate;
    @Column(name = "STATUS")
    private Character status;
    @Column(name = "MESSAGE")
    private String message;
    @Column(name = "CUSTOMER_LOGIN_ID", nullable = true)
    private Long cutomerLoginId;
}
