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
@Table(name = "PROFILE")
public class Profile extends AbstractAuditor {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Basic(optional = false)
    @Column(name = "PROFILE_NAME", nullable = false, length = 80)
    private String profileName;
    @Column(name = "CODE", nullable = false, length = 80)
    private String code;
    @Column(name = "PROFILE_DESCRIPTION", length = 255)
    private String profileDescription;
    @Column(name = "REMARKS", length = 255)
    private String remarks;
    @Basic(optional = false)
    @Column(name = "PROFILE_TYPE", nullable = false)
    private String profileType;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false)
    private Character active;

    @OneToMany(mappedBy = "profile", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<ProfileAttribute> profileAttributes;

    @OneToMany(mappedBy = "profile", fetch = FetchType.EAGER)
    private List<ProfileMainTxnLimit> profileMainTxnLimitList;

    @OneToMany(mappedBy = "profile", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<ProfileFeature> profileFeatures;

    @OneToMany(mappedBy = "profile", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<ProfileAccessibleChannel> profileAccessibleChannelList;

    @OneToMany(mappedBy = "profile", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<ProfileCharge> profileChargeList;

    @Transient
    public ProfileAttribute getProfileAttribute() {
        return profileAttributes.get(0);
    }

    public Profile() {
    }

    public Profile(Long id) {
        this.id = id;
    }
}