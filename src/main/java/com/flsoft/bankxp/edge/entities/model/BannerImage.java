package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author bijay.shrestha
 */
@Getter
@Setter
@Entity
@Table(name = "BANNER_IMAGE")
public class BannerImage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = true)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "IMAGE_PATH")
    private String imagePath;
    @JoinColumn(name = "BANNER_TYPE_ID", referencedColumnName = "ID")
    @OneToOne()
    private BannerType bannerType;
    @Column(name = "BANNER_NAME", nullable = true)
    private String bannerName;
    @Column(name = "ACTIVE", nullable = true, length = 1)
    private Character active;
    @Column(name = "ADDED_BY", nullable = true)
    private Long addedBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ADDED_DATE")
    private Date addedDate;
    @Column(name = "LAST_MODIFIED_BY", nullable = true)
    private Long lastModifiedBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_MODIFIED_DATE")
    private Date lastModifiedDate;
    @Column(name = "SORT_ORDER")
    private Integer sortOrder;
    @Column(name = "IMAGE_NAME")
    private String imageName;
    @Column(name = "BANNER_URL", nullable = true)
    private String bannerUrl;
    @Column(name = "DESCRIPTION", nullable = true)
    private String description;

    public BannerImage() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BannerType getBannerType() {
        return bannerType;
    }

    public void setBannerType(BannerType bannerType) {
        this.bannerType = bannerType;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Character getActive() {
        return active;
    }

    public void setActive(Character active) {
        this.active = active;
    }

    public Long getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(Long addedBy) {
        this.addedBy = addedBy;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Long getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(Long lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BannerImage(Long id) {
        this.id = id;
    }

}
