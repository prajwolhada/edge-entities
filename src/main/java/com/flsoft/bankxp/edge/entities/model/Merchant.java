package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.util.List;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "MERCHANT")
public class Merchant extends AbstractAuditor {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "MERCHANT_NAME")
    private String merchantName;
    @Column(name = "ALLOW_REPAYMENT")
    private String allowRepayment;
    @Basic(optional = false)
    @Column(name = "MNEMONIC")
    private String mnemonic;
    @Basic(optional = false)
    @Column(name = "ACCOUNT_NUMBER", nullable = false, length = 50)
    private String accountNumber;
    @JoinColumn(name = "MERCHANT_TYPE_ID")
    @ManyToOne()
    private MerchantType merchantType;
    @JoinColumn(name = "SERVICE_ID")
    @ManyToOne()
    private Service service;
    @Column(name = "HAS_LIMIT", length = 1)
    private char hasLimit;
    @Column(name = "TOTAL_PARAM", length = 2)
    private Integer totalParam;
    @Column(name = "CONTACT_NUMBER")
    private String contactNumber;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Basic(optional = false)
    @Column(name = "ACTIVE")
    private char active;
    @Column(name = "INSTRUCTION", length = 500)
    private String instruction;
    @Basic(optional = false)
    @Column(name = "REDIRECT_TO_FONEPAY", nullable = false)
    private Character redirectToFonepay;
    @OneToMany(mappedBy = "merchant", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<MerchantNotifier> merchantNotifier;
    @OneToMany(mappedBy = "merchant", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    @OrderBy("minAmount ASC")
    private List<MerchantPayableLimit> merchantPayableLimit;
    @OneToMany(mappedBy = "merchant", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<MerchantPaymentParameter> merchantPaymentParameters;

    @OneToMany(mappedBy = "merchant", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<CommissionInformation> commissionInformations;

    @Basic(optional = false)
    @Column(name = "PAYABLE_LIMIT_TYPE")
    private Character payableLimitType;
    @Column(name = "MERCHANT_DESCRIPTION")
    private String merchantDescription;
    @Column(name = "SORT_ORDER", nullable = true)
    private Integer sortOrder;
    @JoinColumn(name = "MERCHANT_GROUP_ID", referencedColumnName = "ID")
    @ManyToOne
    private MerchantGroup merchantGroup;

    @OneToMany(mappedBy = "merchant", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<MerchantIcon> merchantIcon;

    @Column(name = "ISO_FIELD_TYPE", length = 1)
    private Character isoFieldType;
    @OneToMany(mappedBy = "merchant", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<MerchantIsoParam> merchantIsoParameters;
    @Column(name = "ALLOW_COUNTER_PAYMENT", length = 1)
    private Character hasCounterPayment;
    @Column(name = "DISPLAY_POSITION")
    private String displayPosition;
    @Column(name = "IS_DIRECT_GROUP", length = 1)
    private Character isDirectGroup;
    @Column(name = "ICON")
    private String icon;
    @Column(name = "ACCOUNT_BRANCH_CODE")
    private String accountBranchCode;
    @Column(name = "UNICODE_NAME", columnDefinition = "TEXT")
    private String unicodeName;
    @Column(name = "UNICODE_MERCHANT_DESCRIPTION", columnDefinition = "TEXT")
    private String unicodeDescription;
    @Column(name = "OFFER_TEXT", columnDefinition = "TEXT")
    private String offerText;
    @Column(name = "ACCOUNT_NAME")
    private String accountName;
    @Transient
    private boolean selected;
    @Column(name = "MERCHANT_CATEGORY_CODE_ID", columnDefinition = "TEXT")
    private Long merchantCategoryCodeId;

    public Merchant() {
    }

    public Merchant(Long id) {
        this.id = id;
    }

    public Merchant(Long id, String merchantName, String mnemonic, char active) {
        this.id = id;
        this.merchantName = merchantName;
        this.mnemonic = mnemonic;
        this.active = active;
    }


    public String getBranchCode() {
        return accountBranchCode;
    }

    public void setBranchCode(String branchCode) {
        this.accountBranchCode = branchCode;
    }


}