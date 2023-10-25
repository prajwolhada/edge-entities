package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Narayan
 */
@Getter
@Setter
@Entity
@Table(name = "SUB_FEATURE")
public class SubFeature implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "ACTIVE", length = 1)
    private Character active;
    @Basic(optional = false)
    @Column(name = "CODE", nullable = false, length = 50)
    private String code;
    @Column(name = "NAME", nullable = false, length = 50)
    private String name;
    @Column(name = "DESCRIPTION", length = 255)
    private String description;
    @JoinColumn(name = "FEATURE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Feature feature;
    @Column(name = "IS_VISIBLE", length = 1)
    private Character isVisible;
    @Column(name = "UNICODE_NAME", columnDefinition = "TEXT")
    private String unicodeName;
    @Column(name = "UNICODE_DESCRIPTION", columnDefinition = "TEXT")
    private String unicodeDescription;
    @Column(name = "ICON")
    private String icon;
    @Column(name = "MENU_NAME")
    private String menuName;

}