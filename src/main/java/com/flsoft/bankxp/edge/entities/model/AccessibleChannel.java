package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "ACCESSIBLE_CHANNEL")
public class AccessibleChannel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "CHANNEL_KEY", nullable = false, length = 50)
    private String channelKey;
    @Basic(optional = false)
    @Column(name = "CHANNEL_NAME", nullable = false, length = 100)
    private String channelName;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false, length = 1)
    private Character active;
    @Basic(optional = false)
    @Column(name = "ALLOW_MULTIPLE_LOGIN", nullable = false, length = 1)
    private Character allowMultipleLogin;
    @OneToMany(mappedBy = "accessibleChannel", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<ChannelLoginPattern> channelLoginPatternList;

    public AccessibleChannel() {
    }

    public AccessibleChannel(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
