package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author santosh
 */
@Getter
@Setter
@Entity
@Table(name = "REVERSAL_REQUEST")
public class ReversalRequest implements Serializable {

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
    @Column(name = "FIELD22")
    private String field22;
    @Column(name = "FIELD24")
    private String field24;
    @Column(name = "FIELD25")
    private String field25;
    @Column(name = "FIELD32")
    private String field32;
    @Column(name = "FIELD37")
    private String field37;
    @Column(name = "FIELD38")
    private String field38;
    @Column(name = "FIELD39")
    private String field39;
    @Column(name = "FIELD41")
    private String field41;
    @Column(name = "FIELD42")
    private String field42;
    @Column(name = "FIELD43")
    private String field43;
    @Column(name = "FIELD46")
    private String field46;
    @Column(name = "FIELD49")
    private String field49;
    @Column(name = "FIELD52")
    private String field52;
    @Column(name = "FIELD56")
    private String field56;
    @Column(name = "FIELD90")
    private String field90;
    @Column(name = "FIELD102")
    private String field102;
    @Column(name = "FIELD103")
    private String field103;
    @Column(name = "FIELD123")
    private String field123;
    @JoinColumn(name = "REQUEST_ID", referencedColumnName = "ID")
    @ManyToOne
    private ISO8583Request requestId;

    public ReversalRequest() {
    }

    public ReversalRequest(Long id) {
        this.id = id;
    }
}
