package com.flsoft.bankxp.edge.entities.model;

import com.flsoft.bankxp.edge.entities.constant.BindModeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "SMS_SERVER")
public class SmsServer {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME", length = 50)
    @NotNull
    @Size(min = 4, max = 150)
    private String name;

    @Column(name = "SHORT_CODE", length = 10)
    @NotNull
    @Size(min = 4, max = 10)
    private String shortCode;

    @Column(name = "USERNAME", length = 50)
    @NotNull
    @Size(min = 4, max = 50)
    private String username;

    @Column(name = "PASSWORD", length = 100)
    @NotNull
    @Size(min = 4, max = 100)
    private String password;

    @Column(name = "SOURCE", length = 100)
    private String source;

    @Column(name = "SOURCE_TON", length = 5)
    private String sourceTon;

    @Column(name = "ACTIVE", length = 1)
    @NotNull
    private Character active;

    @Column(name = "SERVER_IP", length = 50)
    @NotNull
    @Size(min = 4, max = 150)
    private String serverIp;

    @Column(name = "PORT", length = 10)
    @NotNull
    @Size(min = 4, max = 10)
    private String port;

    @Column(name = "AUTO_BIND")
    @NotNull
    private Boolean autoBind;

    @Column(name = "BIND_MODE", length = 50)
    @NotNull
    @Enumerated(EnumType.STRING)
    private BindModeEnum bindMode;

    @Column(name = "CREATED_DATE", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "ENQUIRE_LINK_INTERVAL", nullable = false)
    private Integer enquireLinkInterval;

    @Column(name = "RECONNECT_INTERVAL", nullable = false)
    private Integer reconnectInterval;

    @JoinColumn(name = "CHANNEL_PROVIDER_ID", referencedColumnName = "id", nullable = false)
    @ManyToOne()
    private ChannelProvider channelProvider;

    public SmsServer(Long id) {
        this.id = id;
    }
}
