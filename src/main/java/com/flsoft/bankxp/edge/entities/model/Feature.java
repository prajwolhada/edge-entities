package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "FEATURE")
public class Feature implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "NAME", length = 80)
    private String name;
    @Column(name = "FEATURE_KEY", length = 10)
    private String featurekey;
    @Column(name = "ACTIVE", length = 1)
    private Character active;
    @Column(name = "TXN_INVOLVED", length = 1)
    private Character txnInvolved;
    @Column(name = "COMMISSION")
    private Character commission;
    @Column(name = "ALLOW_MULTIPLE_PARTNER")
    private Character allowMultiplePartner;
    @Column(name = "IS_MENU", length = 1)
    private Character isMenu;
    @Column(name = "ICON")
    private String icon;
    @Column(name = "DISPLAY_POSITION")
    private String displayPosition;
    @Column(name = "SORT_ORDER", nullable = true)
    private Integer sortOrder;
    @Transient
    private boolean selected;
    @Column(name = "APP_COMMISSION_MODE")
    private String appCommissionMode;
    @Column(name = "FEATURE_TYPE", length = 40)
    private String featureType;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "feature")
    @Fetch(FetchMode.SUBSELECT)
    private List<SmsKeyword> smsKeywords;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "feature")
    @Fetch(FetchMode.SUBSELECT)
    private List<SubFeature> subFeatures;
    @Column(name = "UNICODE_NAME", columnDefinition = "TEXT")
    private String unicodeName;
    @Column(name = "ALLOW_REPAYMENT")
    private String allowRepayment;

    public Feature() {
    }

    public Feature(Long id) {
        this.id = id;
    }
}