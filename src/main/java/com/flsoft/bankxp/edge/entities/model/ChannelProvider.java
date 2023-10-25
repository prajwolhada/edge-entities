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
@Table(name = "CHANNEL_PROVIDER")
public class ChannelProvider implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "SERVICE_PROVIDER_NAME", length = 50)
    private String serviceProviderName;
    @Column(name = "ABBREVIATION", length = 25)
    private String abbreviation;
    @Basic(optional = false)
    @Column(name = "ACTIVE", length = 1)
    private Character active;
    @OneToMany(mappedBy = "channelProvider", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<ApplicationPattern> applicationPatternList;

    public ChannelProvider() {
    }

    public ChannelProvider(Long id) {
        this.id = id;
    }

}
