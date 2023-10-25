package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Narayan Joshi
 * <narayan.joshi@f1soft.com>
 */
@Getter
@Setter
@Entity
@Table(name = "DEVICE_RESET_GPRS_LOG")
public class DeviceResetGprsLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID")
    @ManyToOne
    private CustomerLogin customerLogin;
    @Column(name = "RESET_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date resetDate;

    public DeviceResetGprsLog() {
    }
}
