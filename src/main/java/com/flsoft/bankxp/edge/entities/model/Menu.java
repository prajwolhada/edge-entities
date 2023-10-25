package com.flsoft.bankxp.edge.entities.model;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "MENU")
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CODE")
    private String code;
    @Column(name = "IS_MENU", length = 1)
    private Character isMenu;
    @Column(name = "ICON")
    private String icon;
    @Column(name = "TINT")
    private char tint;
    @Column(name = "MENU_GROUP")
    private String menuGroup;
    @Column(name = "MENU_TYPE")
    private String menuType;
    @Column(name = "SORT_ORDER", nullable = true)
    private Integer sortOrder;
    @Column(name = "ACTIVE", length = 1)
    private Character active;
    @Column(name = "CHANNEL")
    private String channel;
    @Column(name = "NAV_LINK")
    private String navLink;
    @Column(name = "USER_TYPE")
    private String userType;
    @Column(name = "UNICODE_NAME", columnDefinition = "TEXT")
    private String unicodeName;
    @Column(name = "MENU_AUTH_MODE")
    private String menuAuthMode;
    @Column(name = "IOS_VERSION")
    private Integer iosVersion;
    @Column(name = "ANDROID_VERSION")
    private Integer androidVersion;
    @Column(name = "DESCRIPTION", columnDefinition = "TEXT")
    private String description;
    @OneToMany(mappedBy = "menu", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<SubMenu> subMenus;
    @JoinColumn(name = "PARENT_MENU_ID", referencedColumnName = "ID", nullable = true, insertable = false, updatable = false)
    @ManyToOne()
    private Menu parentMenu;
    @Column(name = "GATE_TYPE")
    private String gateType;
    @Column(name = "RAW_MENU", columnDefinition = "TEXT")
    private String rawMenu;
    @Column(name = "UNICODE_DESCRIPTION", columnDefinition = "TEXT")
    private String unicodeDescription;
}
