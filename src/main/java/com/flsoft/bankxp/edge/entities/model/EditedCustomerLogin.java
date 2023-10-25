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
@Table(name = "EDITED_CUSTOMER_LOGIN")
public class EditedCustomerLogin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Basic(optional = false)
    @Column(name = "USERNAME", nullable = false, length = 20)
    private String username;
    @Column(name = "ACTIVE")
    private Character active;
    @Column(name = "APPLICATION_PATTERN_ID", nullable = true)
    private Long applicationPatternId;
    @Column(name = "EDITED_CUSTOMER_ID", nullable = false)
    private Long editedCustomerId;
    @Column(name = "CUSTOMER_LOGIN_ID", nullable = true)
    private Long customerLoginId;
    @Column(name = "IS_PRIMARY")
    private Character isPrimary;
    @JoinColumn(name = "EDITED_CUSTOMER_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    @ManyToOne()
    private EditedCustomer editedCustomer;
    @OneToMany(mappedBy = "editedCustomerLogin", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<EditedLoginAccessChannel> editedLoginAccessChannels;

    public EditedCustomerLogin() {
    }

    public EditedCustomerLogin(Long id) {
        this.id = id;
    }

    public EditedCustomerLogin(Long id, String username) {
        this.id = id;
        this.username = username;
    }

}