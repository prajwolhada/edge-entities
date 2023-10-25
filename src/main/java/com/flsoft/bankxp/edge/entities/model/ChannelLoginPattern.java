package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "CHANNEL_LOGIN_PATTERN")
public class ChannelLoginPattern implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @JoinColumn(name = "ACCESSIBLE_CHANNEL_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AccessibleChannel accessibleChannel;
    @JoinColumn(name = "APPLICATION_PATTERN_ID", referencedColumnName = "ID")
    @ManyToOne()
    private ApplicationPattern applicationPattern;

    public ChannelLoginPattern() {
    }

    public ChannelLoginPattern(Long id) {
        this.id = id;
    }
}
