package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER")
public class Customer extends AbstractAuditor {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "FIRST_NAME", length = 50)
    private String firstName;
    @Column(name = "MIDDLE_NAME", length = 50)
    private String middleName;
    @Column(name = "LAST_NAME", length = 50)
    private String lastName;
    @Column(name = "ADDRESS", length = 100)
    private String address;
    @Column(name = "EMAIL_ADDRESS", length = 100)
    private String emailAddress;
    @Column(name = "ACTIVE")
    private Character active;
    @Basic(optional = false)
    @Column(name = "BRANCH_ID", nullable = false)
    private Long branchId;

    @Column(name = "REJECT_REMARKS", nullable = true, length = 255)
    private String rejectRemarks;
    @Column(name = "APPROVED", length = 1)
    private Character approved;
    @Column(name = "GENDER", length = 2)
    private String gender;

    @JoinColumn(name = "APPROVED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private ApplicationUser approvedBy;

    @Column(name = "APPROVED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date approvedDate;

    @JoinColumn(name = "REJECTED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private ApplicationUser rejectedBy;

    @Column(name = "REJECTED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rejectedDate;

    @JoinColumn(name = "DELETED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private ApplicationUser deletedBy;

    @Column(name = "DELETED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedDate;
    @Column(name = "DELETE_REMARKS", length = 255)
    private String deleteRemarks;

    @JoinColumn(name = "DELETE_APPROVED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private ApplicationUser deletedApprovedBy;

    @Column(name = "DELETED_APPROVED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedApprovedDate;
    @Column(name = "EDIT_APPROVED_BY", length = 25)
    private String editApprovedBy;
    @Column(name = "EDIT_APPROVED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date editApprovedDate;
    @Column(name = "LAST_MODIFIED_REMARKS", length = 100)
    private String lastModifiedRemarks;
    @Column(name = "LATEST_ACTIVITY_REMARKS", length = 100)
    private String latestActivityRemarks;

    @Column(name = "CONTACT_NO", length = 15)
    private String contactNo;
    @Column(name = "MOBILE_NUMBER", length = 15)
    private String mobileNumber;
    @Column(name = "LATEST_CHANGED_MOBILE", length = 15)
    private String latestChangedMobile;
    @Column(name = "CBS_ID", length = 50)
    private String cbsId;
    @Column(name = "AC_HOLDER", length = 1)
    private char acHolder;
    @Column(name = "MODE", length = 20)
    private String mode;
    @Column(name = "PRIMARY_ACCOUNT", length = 20)
    private String primaryAccount;
    @Column(name = "HAS_SECURITY_QUESTION", length = 1)
    private char hasSecurityQuestion;
    @Column(name = "TXN_AUTH_MODE", length = 1)
    private String txnAuthMode;
    @Column(name = "QR_LOGIN", length = 1)
    private String qrLogin;
    @Column(name = "REGISTRATION_TYPE")
    private String registrationType;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<BankAccount> bankAccountList;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<CardAccount> cardAccountList;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<CustomerLinkedAccount> customerLinkedAccountList;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<CustomerLogin> customerLoginList;

    @JoinColumn(name = "BRANCH_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne()
    private Branch branch;

    @JoinColumn(name = "PROFILE_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private Profile profile;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<CustomerSecurityAnswer> securityAnswerList;

    @Column(name = "PROFILE_IMAGE")
    private String profileImage;

    @Column(name = "EMAIL_VERIFY")
    private Character emailVerify;

    @Column(name = "LANGUAGE", length = 255)
    private String language;

    @Column(name = "NOTIFICATION_LANGUAGE", length = 255)
    private String notificationLanguage;
    @Column(name = "BANK_KYC_VERIFY")
    private Character bankKycVerify;

    public Customer() {
    }

    public Customer(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        if (firstName != null && firstName.length() > 0) {
            return firstName.trim();
        }
        return firstName;
    }

    public String getMiddleName() {
        if (middleName != null && middleName.length() > 0) {
            return middleName.trim();
        }
        return middleName;
    }

    public String getLastName() {
        if (lastName != null && lastName.length() > 0) {
            return lastName.trim();
        }
        return lastName;
    }

    public String getFullname() {
        StringBuilder fullName = new StringBuilder(firstName.trim());
        if (middleName != null && middleName.trim().length() > 0) {
            fullName.append(" ").append(middleName.trim());
        }
        if (lastName != null && lastName.trim().length() > 0) {
            fullName.append(" ").append(lastName.trim());
        }
        return fullName.toString();
    }

    public String getVerifiedEmailAddress() {
        if (emailVerify != null && emailVerify.equals('Y')) {
            return emailAddress;
        } else {
            return null;
        }
    }

}