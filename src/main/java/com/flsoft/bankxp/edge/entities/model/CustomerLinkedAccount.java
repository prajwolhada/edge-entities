package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_LINKED_ACCOUNT")
public class CustomerLinkedAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "ACCOUNT_NUMBER", length = 50)
    private String accountNumber;
    @Column(name = "ACCOUNT_ALIAS", length = 5)
    private String accountAlias;
    @Column(name = "ACCOUNT_OWNER_CBS_ID", length = 50)
    private String accountOwnerCBSId;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;
    @Column(name = "ACTIVE", length = 1)
    private Character active;
    @Column(name = "ACCOUNT_HOLDER_NAME")
    private String accountHolder;
    @Column(name = "BANK_CODE")
    private String bankCode;
    @Column(name = "SERVICE_CODE")
    private String serviceCode;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;
    @Column(name = "BRANCH_CODE")
    private String branchCode;

    @Transient
    private String status;

    public CustomerLinkedAccount() {
    }

    public CustomerLinkedAccount(Long id) {
        this.id = id;
    }

}
