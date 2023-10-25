package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "FONEPAY_SERVICE_DETAIL")
public class FonepayServiceDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "FONEPAY_TYPE", nullable = false, length = 500)
    private String fonepayType;
    @Basic(optional = false)
    @Column(name = "MNEMONIC", nullable = false, length = 10)
    private String mnemonic;
    @JoinColumn(name = "FONEPAY_SERVICE_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private FonepayService fonepayService;
    @JoinColumn(name = "KEYWORD_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private SmsKeyword smsKeyword;
}
