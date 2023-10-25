package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author prajwol.hada
 */
@Getter
@Setter
@Entity
@Table(name = "OFFER_LEAD")
public class OfferLead implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "FULL_NAME")
    private String fullName;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;
    @Column(name = "REQUESTED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestedDate;
    @Column(name = "STATUS")
    private String status;
    @ManyToOne()
    @JoinColumn(name = "OFFER_ID", referencedColumnName = "ID")
    private Offer offer;

    @ManyToOne()
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    private Customer customerId;

    @OneToMany(mappedBy = "offerLead", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<OfferLeadHistory> history;
}
