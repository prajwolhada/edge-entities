package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author Nitesh Poudel
 */
@Entity
@Table(name = "FCM_REG_ID")
@Getter
@Setter
public class CustomerFcmRegId implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PROFILE_ID")
    private String profileId;
    @Column(name = "USER_ID")
    private Long userId;
    @Column(name = "ACCOUNT_TYPE_CODE")
    private String accountTypeCode;
    @Column(name = "APP_REG_ID")
    private String appRegId;
    @Column(name = "WEB_REG_ID")
    private String webRegId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RECORDED_DATE")
    private Date recordedDate;
    @Column(name = "FULL_NAME")
    private String fullName;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "MIDDLE_NAME")
    private String middleName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "PROCESS_STATUS", nullable = false)
    private Integer processStatus;

}