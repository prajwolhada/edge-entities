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
@Table(name = "BANK_USER_MENU")
public class BankUserMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "MENU_TEXT", length = 100)
    private String menuText;
    @Column(name = "MENU_ACTION", length = 30)
    private String menuAction;
    @Column(name = "ENABLED", length = 1)
    private char enabled;
    @Column(name = "MENU_ORDER")
    private Integer menuOrder;
    @Column(name = "MENU_CLASS", length = 30)
    private String menuClass;
    @Column(name = "GROUP_IDENTIFIER", length = 30)
    private String groupIdentifier;
    @Column(name = "GROUP_ACTION", length = 30)
    private String groupAction;
    @Column(name = "GROUP_LABEL", length = 100)
    private String groupLabel;
    @Column(name = "PARENT_ID")
    private Integer parentId;
    @Column(name = "MENU_URL")
    private String menuUrl;
    @JoinColumn(name = "PARENT_ID", referencedColumnName = "ID", nullable = true, insertable = false, updatable = false)
    @ManyToOne()
    private BankUserMenu parentMenu;
    @Transient
    private boolean selected;
    @Transient
    private boolean assignedMenuBlocked;

    public BankUserMenu() {
    }

    public BankUserMenu(Integer id) {
        this.id = id;
    }

}
