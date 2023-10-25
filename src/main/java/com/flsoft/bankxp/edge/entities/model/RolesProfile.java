package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author root
 */
@Getter
@Setter
@Entity
@Table(name = "ROLES_PROFILE")
public class RolesProfile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @JoinColumn(name = "PROFILE_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Profile profile;
    @JoinColumn(name = "BANK_USER_MENU_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private BankUserMenu bankUserMenu;
    @Column(name = "ENABLED", length = 1)
    private char enabled;
}