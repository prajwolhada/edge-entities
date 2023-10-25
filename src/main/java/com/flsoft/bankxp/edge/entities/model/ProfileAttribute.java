package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "PROFILE_ATTRIBUTE")
public class ProfileAttribute extends AbstractAuditor {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CHARGE_ACCOUNT", length = 20)
    private String chargeAccount;
    @Column(name = "TRIAL_INTERVAL")
    private Integer trialInterval;
    @Column(name = "RENEW_INTERVAL")
    private Integer renewInterval;
    @Column(name = "HAS_OPEN_TRANSFER", length = 1)
    private Character hasOpenTransfer;

    @JoinColumn(name = "PROFILE_ID", referencedColumnName = "ID", nullable = true)
    @OneToOne(fetch = FetchType.EAGER)
    private Profile profile;

    @JoinColumn(name = "OTP_DELIVERY_OPTION_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private OtpDeliveryOption otpDeliveryOption;
    @Column(name = "REGISTRATION_CHARGE_ACCOUNT", length = 20)
    private String registrationChargeAccount;
    @Column(name = "RENEW_CHARGE_ACCOUNT", length = 20)
    private String renewChargeAccount;
    @Column(name = "SERVICE_RESET_CHARGE_ACCOUNT", length = 20)
    private String serviceResetChargeAccount;
    @Column(name = "AUTHORIZATION_MODE", length = 20)
    private String authorizationMode;
    @Column(name = "REGISTRATION_CHARGE_ACCOUNT_NAME", length = 20)
    private String registrationChargeAccountName;
    @Column(name = "RENEW_CHARGE_ACCOUNT_NAME", length = 20)
    private String renewChargeAccountName;
    @Column(name = "SERVICE_RESET_CHARGE_ACCOUNT_NAME", length = 20)
    private String serviceResetChargeAccountName;
    @Column(name = "TXN_LIMIT_RESET_MODE")
    private String txnLimitResetMode; //MONTHLY/YEARLY
    @Column(name = "SMS_VERIFICATION", nullable = true)
    private Character smsVerification;

    public ProfileAttribute() {
    }
}