package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Date;

/**
 * @author Richa Pokhrel
 */

@Getter
@Setter
@Entity
@Table(name = "CLEAR_USER_TOKEN")
public class ClearUserToken {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "STATUS", nullable = false)
    private Integer status;

    @Column(name = "USER_TYPE", nullable = false)
    private String userType;

    @Column(name = "USER_NAME", nullable = false)
    private String userName;

    @Column(name = "REQUESTED_DATE")
    private Date requestedDate;

    @Column(name = "COMPLETED_DATE")
    private Date completedDate;

}
