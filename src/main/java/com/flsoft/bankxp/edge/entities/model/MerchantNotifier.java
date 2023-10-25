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
@Table(name = "MERCHANT_NOTIFIER")
public class MerchantNotifier extends AbstractAuditor {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "NOTIFIER")
    private String notifier;
    @Basic(optional = false)
    @JoinColumn(name = "APPLICATION_PATTERN_ID")
    @ManyToOne()
    private ApplicationPattern applicationPattern;
    @JoinColumn(name = "MERCHANT_ID", referencedColumnName = "ID")
    @ManyToOne()
    private Merchant merchant;
    @Basic(optional = false)
    @Column(name = "ACTIVE", length = 1)
    private char active;


    public MerchantNotifier() {
    }

    public MerchantNotifier(Long id) {
        this.id = id;
    }

}