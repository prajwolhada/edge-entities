package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Date;

/**
 *
 * @author prajwol.hada
 */
@Getter
@Setter
@Entity
@Table(name = "OFFER_LEAD_HISTORY")
public class OfferLeadHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "STATUS")
    private String status;
    @ManyToOne()
    @JoinColumn(name = "OFFER_LEAD_ID")
    private OfferLead offerLead;
    @Column(name = "ADDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
    @JoinColumn(name = "APPLICATION_USER_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private ApplicationUser applicationUser;

}
