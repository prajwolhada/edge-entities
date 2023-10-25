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
@MappedSuperclass
public class AbstractAuditor implements Serializable {

    @JoinColumn(name = "CREATED_BY", referencedColumnName = "ID")
    @ManyToOne
    private ApplicationUser createdBy;

    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @JoinColumn(name = "LAST_MODIFIED_BY", referencedColumnName = "ID")
    @ManyToOne
    private ApplicationUser lastModifiedBy;

    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
}