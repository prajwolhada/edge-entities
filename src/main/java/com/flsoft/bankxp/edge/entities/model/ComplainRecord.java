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
 * @author Administrator
 */
@Getter
@Setter
@Entity
@Table(name = "COMPLAIN_RECORD")
public class ComplainRecord implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name = "DESCRIPTION")
    private String description;
    @ManyToOne()
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    private Customer customerId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "INITIATED_DATE")
    private Date initiatedDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ISSUE_DATE")
    private Date issueDate;
    @OneToMany(mappedBy = "complainRecord", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<ComplainRecordFile> complainRecordFiles;
    @Column(name = "STATUS")
    private String status;
    @JoinColumn(name = "COMPLAIN_CATEGORY_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private ComplainCategory complainCategory;
    @Column(name = "AMOUNT", nullable = true)
    private Double amount;
    @Column(name = "COMPLETED_DATE", nullable = true)
    private Date completedDate;
    @Column(name = "TRAN_ID", nullable = true)
    private String tranId;
    @Column(name="ACCOUNT_NUMBER", nullable= true)
    private String accountNumber;
    @Column(name="BRANCH_CODE", nullable= true)
    private String branchCode;
}
