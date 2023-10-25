package com.flsoft.bankxp.edge.entities.model;


import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "SUB_MENU")
public class SubMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "UNICODE_NAME", columnDefinition = "TEXT")
    private String unicodeName;
    @Column(name = "CODE", nullable = false, length = 225)
    private String code;
    @Column(name = "ICON")
    private String icon;
    @Column(name = "TINT")
    private char tint;
    @Column(name = "SORT_ORDER", nullable = true)
    private Integer sortOrder;
    @Column(name = "ACTIVE", length = 1)
    private Character active;
    @Column(name = "DESCRIPTION", columnDefinition = "TEXT")
    private String description;
    @Column(name = "NAV_LINK")
    private String navLink;
    @Column(name = "MENU_TYPE")
    private String menuType;
    @Column(name = "IOS_VERSION")
    private Integer iosVersion;
    @Column(name = "ANDROID_VERSION")
    private Integer androidVersion;
    @JoinColumn(name = "MENU_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Menu menu;
    @JoinColumn(name = "FEATURE_ID", referencedColumnName = "ID")
    @OneToOne()
    private Feature feature;
    @Column(name = "GATE_TYPE")
    private String gateType;
    @Column(name = "RAW_MENU", columnDefinition = "TEXT")
    private String rawMenu;
    @Column(name = "UNICODE_DESCRIPTION", columnDefinition = "TEXT")
    private String unicodeDescription;
}
