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
@Table(name = "APPLICATION_PATTERN")
public class ApplicationPattern implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @JoinColumn(name = "CHANNEL_PROVIDER_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne(fetch = FetchType.EAGER)
    private ChannelProvider channelProvider;
    @Column(name = "PATTERN", nullable = true, length = 255)
    private String pattern;
    @Column(name = "PATTERN_CODE", length = 50)
    private String patternCode;
    @Column(name = "NAME", nullable = false, length = 50)
    private String name;
    @JoinColumn(name = "LOGIN_TYPE_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private LoginType loginType;
    @Column(name = "VALIDATOR_MESSAGE", length = 255)
    private String validatorMessage;
    @OneToMany(mappedBy = "applicationPattern", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<PasswordNotification> passwordNotificationList;

    public ApplicationPattern() {
    }

    public ApplicationPattern(Long id) {
        this.id = id;
    }
}
