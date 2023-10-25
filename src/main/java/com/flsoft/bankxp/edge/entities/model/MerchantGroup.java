package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Narayan Joshi
 * <narayan.joshi@f1soft.com>
 */
@Getter
@Setter
@Entity
@Table(name = "MERCHANT_GROUP")
public class MerchantGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ACTIVE", length = 1)
    private char active;
    @Column(name = "GROUP_NAME")
    private String name;
    @Column(name = "UNICODE_NAME")
    private String unicodeName;
    @Column(name = "CODE")
    private String code;
    @Column(name = "SORT_ORDER", nullable = true)
    private Integer sortOrder;
    @Column(name = "ICON")
    private String icon;
    @Column(name = "DISPLAY_POSITION")
    private String displayPosition;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "UNICODE_DESCRIPTION", columnDefinition = "TEXT")
    private String unicodeDescription;
    @Column(name = "OFFER_TEXT", columnDefinition = "TEXT")
    private String offerText;

    @OneToMany(mappedBy = "merchantGroup", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<MerchantGroupIcon> merchantGroupIcons;


    public MerchantGroup() {
    }

    public MerchantGroup(Long id) {
        this.id = id;
    }

    public MerchantGroup(String name, Integer sortOrder) {
        this.name = name;
        this.sortOrder = sortOrder;
    }
}
