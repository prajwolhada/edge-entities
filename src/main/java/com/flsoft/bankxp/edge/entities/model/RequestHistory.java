package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Sabrin Luitel
 */
@Getter
@Setter
@Entity
@Table(name = "REQUEST_HISTORY")
public class RequestHistory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "REQUEST_ID")
    private Long requestId;
    @Column(name = "ADDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
    @Column(name = "TYPE")
    private String type;
    @Column(name="USER_ID")
    private Long userId;
    @Column(name="INITIATED_BY")
    private String initiatedBy;
}
