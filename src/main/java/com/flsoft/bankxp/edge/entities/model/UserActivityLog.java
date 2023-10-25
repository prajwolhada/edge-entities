package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "USER_ACTIVITY_LOG")
public class UserActivityLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "USER_ACTIVITY_TYPE", nullable = false)
    private String userActivityType;
    @Basic(optional = false)
    @Column(name = "ACTIVITY_DESCRIPTION", nullable = false, columnDefinition = "TEXT")
    private String activityDescription;
    @Basic(optional = false)
    @Column(name = "ACTIVITY_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date activityDate;
    @Basic(optional = true)
    @Column(name = "TRACK_ID")
    private Long trackId;
    @JoinColumn(name = "ACCESSIBLE_CHANNEL_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private AccessibleChannel accessibleChannelId;
    @JoinColumn(name = "APPLICATION_USER_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private ApplicationUser applicationUser;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private Customer customer;
    @JoinColumn(name = "TO_USER_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private ApplicationUser toApplicationUser;

    public UserActivityLog() {
    }
}