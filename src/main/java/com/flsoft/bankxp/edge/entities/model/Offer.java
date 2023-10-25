package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author prajwol.hada
 */
@Getter
@Setter
@Entity
@Table(name = "OFFER")
public class Offer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SHORT_DESCRIPTION", length = 500)
    private String shortDescription;
    @Column(name = "DESCRIPTION", length = 1000)
    private String description;
    @Column(name = "START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date EndDate;
    @Column(name = "ACTION_BUTTON_NAME")
    private String actionButtonName;
    @Column(name = "NAVIGATION_URL")
    private String navigationUrl;
    @Column(name = "IMAGE_PATH")
    private String imagePath;
    @Column(name = "MOBILE_IMAGE_PATH")
    private String mobileImagePath;
    @Column(name = "ACTIVE")
    private Character active;
    @JoinColumn(name = "ADDED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = false)
    private ApplicationUser addedBy;
    @Column(name = "ADDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
    @JoinColumn(name = "MODIFIED_BY", referencedColumnName = "ID")
    @ManyToOne()
    private ApplicationUser modifiedBy;
    @Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "OFFER_CATEGORY_ID", referencedColumnName = "ID")
    @ManyToOne()
    private OfferCategory category;
    @Column(name = "SHOW_ON_LOGIN_PAGE")
    private Character showOnLoginPage;
    @Column(name = "SORT_ORDER")
    private Integer sortOrder;
}
