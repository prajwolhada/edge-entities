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
@Table(name = "CHEQUE_BOOK_HISTORY")
public class ChequeBookHistory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "STATUS")
    private String status;
    @ManyToOne()
    @JoinColumn(name = "CHEQUE_REQUEST_ID")
    private ChequeBookRequest chequeBookRequest;
    @Column(name = "ADDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
}
