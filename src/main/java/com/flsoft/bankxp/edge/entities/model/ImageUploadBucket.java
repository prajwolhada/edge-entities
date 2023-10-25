package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

/**
 * @author Richa Pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "IMAGE_UPLOAD_BUCKET")
public class ImageUploadBucket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 19, scale = 0)
    private Long id;
    @Column(name = "BUCKET_NAME")
    private String bucketName;
    @Column(name = "CODE", nullable = false)
    private String code;

}
