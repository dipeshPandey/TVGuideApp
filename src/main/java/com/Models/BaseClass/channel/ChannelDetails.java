package com.Models.BaseClass.channel;

import javax.persistence.*;
import javax.persistence.metamodel.CollectionAttribute;
import java.util.Collection;

/**
 * Created by mepesh on 10/26/2017.
 */
@Entity
public class ChannelDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String coverage;
    // one to many mapping for region
    private String region;
    private String type;
    private String Address;
    private String channelDescription;
    @JoinColumn(name="channel_fk")
    @OneToOne
    private Channel channelId;

}
