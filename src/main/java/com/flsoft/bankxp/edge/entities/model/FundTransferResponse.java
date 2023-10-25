package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author santosh
 */
@Getter
@Setter
@Entity
@Table(name = "FUNDTRANSFER_RESPONSE")
public class FundTransferResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "MTI")
    private String mti;
    @Column(name = "FIELD2")
    private String field2;
    @Column(name = "FIELD3")
    private String field3;
    @Column(name = "FIELD4")
    private String field4;
    @Column(name = "FIELD7")
    private String field7;
    @Column(name = "FIELD11")
    private String field11;
    @Column(name = "FIELD12")
    private String field12;
    @Column(name = "FIELD13")
    private String field13;
    @Column(name = "FIELD15")
    private String field15;
    @Column(name = "FIELD17")
    private String field17;
    @Column(name = "FIELD18")
    private String field18;
    @Column(name = "FIELD32")
    private String field32;
    @Column(name = "FIELD38")
    private String field38;
    @Column(name = "FIELD39")
    private String field39;
    @Column(name = "FIELD41")
    private String field41;
    @Column(name = "FIELD47")
    private String field47;
    @Column(name = "FIELD48")
    private String field48;
    @Column(name = "FIELD49")
    private String field49;
    @Column(name = "FIELD54")
    private String field54;
    @Column(name = "FIELD102")
    private String field102;
    @Column(name = "FIELD103")
    private String field103;
    @Column(name = "FIELD111")
    private String field111;
    @Column(name = "FIELD123")
    private String field123;
    @Column(name = "FIELD125")
    private String field125;
    @Column(name = "FIELD126")
    private String field126;
    @Column(name = "FIELD28")
    private String field28;
    @Column(name = "FIELD29")
    private String field29;
    @Column(name = "FIELD30")
    private String field30;
    @Column(name = "FIELD31")
    private String field31;
    @Column(name = "FIELD60")
    private String field60;
    @Column(name = "RAW_RESPONSE")
    private String rawResponse;
    @JoinColumn(name = "REQUEST_ID", referencedColumnName = "ID")
    @ManyToOne
    private ISO8583Request requestId;

    public FundTransferResponse() {
    }

    public FundTransferResponse(Long id) {
        this.id = id;
    }

}
