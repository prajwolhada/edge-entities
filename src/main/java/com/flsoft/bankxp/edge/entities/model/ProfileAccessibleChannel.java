package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "PROFILE_ACCESSIBLE_CHANNEL")
public class ProfileAccessibleChannel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "ACCESSIBLE_CHANNEL_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AccessibleChannel accessibleChannel;

    @Column(name = "ACCESSIBLE_CHANNEL_ID", nullable = false, precision = 38, scale = 0, insertable = false, updatable = false)
    private Long accessibleChannelId;

    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false)
    private Character active;

    @JoinColumn(name = "PROFILE_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Profile profile;

    public ProfileAccessibleChannel() {
    }

    public Integer getId() {
        return id;
    }
}