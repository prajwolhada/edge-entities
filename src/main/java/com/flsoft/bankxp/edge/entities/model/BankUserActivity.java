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
@Table(name = "BANK_USER_ACTIVITY")
public class BankUserActivity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ACTIVITY_DATE")
    private String activityDate;
    @Column(name = "ACTIVITY_DESCRIPTION")
    private String activityDescription;
    @Column(name = "ACTIVITY_DONE_TO")
    private String activityDoneTo;
    @Column(name = "SESSION_KEY")
    private String sessionKey;
    @JoinColumn(name = "ACTIVITY_TYPE_ID", referencedColumnName = "ID")
    @ManyToOne()
    private ActivityType activityType;
    @Column(name = "LOGGED_IP")
    private String loggedIp;
    @Column(name = "TRACK_ID")
    private Long trackId;
    @JoinColumn(name = "APPLICATION_USER_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private ApplicationUser applicationUser;

}
