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
@Table(name = "APPLICATION_SETUP")
public class ApplicationSetup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "APPLICATION_KEY", length = 255)
    private String applicationKey;
    @Column(name = "APPLICATION_VALUE", length = 255)
    private String applicationValue;
    @Column(name = "APPLICATION_LABEL", length = 255)
    private String applicationLabel;
    @Column(name = "ALLOWED_VALUE", length = 255)
    private String allowedValue;
    @Column(name = "SETUP_INPUT_TYPE", length = 20)
    private String setupInputType;
    @Column(name = "IS_CONFIGURABLE", length = 2, nullable = false)
    private String isConfigurable;
    @JoinColumn(name = "APPLICATION_PATTERN_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private ApplicationPattern applicationPattern;

    public ApplicationSetup() {
    }

    public ApplicationSetup(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApplicationKey() {
        return applicationKey;
    }

    public void setApplicationKey(String applicationKey) {
        this.applicationKey = applicationKey;
    }

    public String getApplicationValue() {
        return applicationValue;
    }

    public void setApplicationValue(String applicationValue) {
        this.applicationValue = applicationValue;
    }

    public String getAllowedValue() {
        return allowedValue;
    }

    public void setAllowedValue(String allowedValue) {
        this.allowedValue = allowedValue;
    }

    public String getApplicationLabel() {
        return applicationLabel;
    }

    public void setApplicationLabel(String applicationLabel) {
        this.applicationLabel = applicationLabel;
    }

    public String getSetupInputType() {
        return setupInputType;
    }

    public void setSetupInputType(String setupInputType) {
        this.setupInputType = setupInputType;
    }

    public String getIsConfigurable() {
        return isConfigurable;
    }

    public void setIsConfigurable(String isConfigurable) {
        this.isConfigurable = isConfigurable;
    }

    public ApplicationPattern getApplicationPattern() {
        return applicationPattern;
    }

    public void setApplicationPattern(ApplicationPattern applicationPattern) {
        this.applicationPattern = applicationPattern;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApplicationSetup)) {
            return false;
        }
        ApplicationSetup other = (ApplicationSetup) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.f1soft.smsbanking.entities.ApplicationSetup[id=" + id + "]";
    }
}
