package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author bijay.shrestha
 */
@Getter
@Setter
@Entity
@Table(name = "ADMIN_PROFILE_PICTURE")
public class AdminProfilePicture implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "APPLICATION_USER_ID")
    private Long applicationUserId;
    @Column(name = "IMAGE_PATH")
    private String imagePath;
    @Column(name = "ACTIVE")
    private Character active;
    @Column(name = "LAST_UPDATED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedAt;

}
