package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.util.List;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "PROFILE_FEATURE")
public class ProfileFeature extends AbstractAuditor {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @JoinColumn(name = "FEATURE_ID")
    @ManyToOne()
    private Feature feature;
    @JoinColumn(name = "PROFILE_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Profile profile;
    @Column(name = "ACTIVE", length = 1)
    private Character active;

    @OneToMany(mappedBy = "profileFeature", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<ProfileTxnAlert> profileTxnAlerts;

    @OneToMany(mappedBy = "profileFeature", fetch = FetchType.EAGER)
    private List<ProfileTxnLimit> profileTxnLimitList;

    @Transient
    public ProfileTxnAlert getProfileTxnAlert() {
        if (!profileTxnAlerts.isEmpty()) {
            return profileTxnAlerts.get(0);
        }
        return null;
    }


    public ProfileFeature() {
    }

}