package com.flsoft.bankxp.edge.entities.model;

import com.flsoft.bankxp.edge.entities.converter.EncryptConverter;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author user
 */
@Getter
@Setter
@Table(name = "OTP_REQUEST")
@Entity
public class OtpRequest implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ORIGINAL_ID")
    private Long originalId;

    @Convert(converter = EncryptConverter.class)
    @Column(name = "CODE", length = 150)
    private String code;
    @Column(name = "BOOKING_ID")
    private String bookingId;
    @Column(name = "REQUEST_TYPE", length = 150)
    private String requestType;
    @Column(name = "ACTIVE", length = 1)
    private Character active;
    @Column(name = "CREATED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "CUSTOMER_LOGIN_ID")
    private Long customerLoginId;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name = "INVALID_COUNT")
    private int invalidCount;
    /**
     * notificationMode = EMAIL, SMS, BOTH
     */
    @Column(name = "NOTIFICATION_MODE")
    private String notificationMode;

    @Column(name = "IS_USED", length = 1)
    private Character isUsed;

    public OtpRequest() {
    }

    public OtpRequest(Long id) {
        this.id = id;
    }
}
