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
 * @author Narayan Joshi
 * <narayan.joshi@f1soft.com>
 */

@Getter
@Setter
@Entity
@Table(
        name = "BATCH_RENEW",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"FILE_NAME"})}
)
public class BatchRenew implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "FILE_NAME", unique = true, length = 255, nullable = false)
    private String fileName;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Basic(optional = false)
    @JoinColumn(name = "CREATED_BY", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private ApplicationUser createdBy;
    @Column(name = "APPROVED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date approvedDate;
    @JoinColumn(name = "APPROVED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private ApplicationUser approvedBy;
    @Column(name = "TOTAL_RECORD")
    private Integer totalRecord;
    @Column(name = "STATUS", length = 50)
    private String status;
    @Column(name = "IS_COMPLETED", length = 1)
    private Character isCompleted;

    @Transient
    private boolean checked;
    @OneToMany(mappedBy = "batchRenew", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<BatchRenewLog> batchRenewLog;


    public BatchRenew() {
    }

    public BatchRenew(Long id) {
        this.id = id;
    }

    public BatchRenew(String fileName) {
        this.fileName = fileName;
    }
}
