package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "RATE_LIMIT_CONFIG")
public class RateLimitConfig implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "API_TYPE")
    private String apiType;
    @Column(name = "MAX_ATTEMPT")
    private Integer maxAttempt;
    @Column(name = "UNBLOCK_TIME")
    private Integer unblockTime;
    @Column(name = "AUTO_UNBLOCK")
    private String autoUnblock;
    @Column(name = "RATE_LIMIT_TYPE")
    private String rateLimitType;
    @Column(name = "RATE_RESET_INTERVAL")
    private String rateResetInterval;
}
