package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Date;

/**
 * @author Narayan Joshi
 * <narayan.joshi@f1soft.com>
 */
@Getter
@Setter
@Entity
@Table(name = "LOGIN_DEVICE_INFO_RESET_LOG")
public class LoginDeviceInfoResetLog {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID")
    @ManyToOne
    private CustomerLogin customerLogin;
    @Column(name = "ACTIVITY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date activityDate;
    @Column(name = "RESET_MODE")
    private String resetMode;

    public LoginDeviceInfoResetLog() {
    }

}