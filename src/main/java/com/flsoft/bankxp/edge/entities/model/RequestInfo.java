package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "REQUEST_INFO")
public class RequestInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", nullable = true)
    @ManyToOne()
    private CustomerLogin customerLogin;
    @JoinColumn(name = "FEATURE_ID")
    @ManyToOne()
    private Feature feature;
    @Column(name = "REQUESTED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestedDate;
    @OneToOne(mappedBy = "requestInfo")
    private IsoTxnRequest isoTxnRequest;
    @OneToOne(mappedBy = "requestInfo")
    private TxnRequestDetail txnRequestDetail;
    @JoinColumn(name = "ACCESSIBLE_CHANNEL_ID", nullable = true)
    @ManyToOne()
    private AccessibleChannel accessibleChannel;
    @JoinColumn(name = "MERCHANT_ID", referencedColumnName = "ID")
    @ManyToOne()
    private Merchant merchant;
    @JoinColumn(name = "MODULE_ID", referencedColumnName = "ID")
    @ManyToOne()
    private ApplicationModule module;
    @OneToMany(mappedBy = "requestInfo")
    List<RequestInfoParam> requestInfoParamList;
    @Column(name = "REQUEST_TYPE", length = 20)
    private String requestType;
    @Column(name = "BOOKING_ID", length = 100)
    private String bookingId;
    @Column(name = "IS_USED")
    private Character isUsed;
    @Column(name = "CHANNEL", length = 10)
    private String channel;

    public RequestInfo() {
    }

    public RequestInfo(Long id) {
        this.id = id;
    }

}
