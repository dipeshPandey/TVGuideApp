package com.Models.BaseClass.channel;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mepesh on 10/26/2017.
 */
@Entity
public class ChannelSubscriptionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date subStartDate;
    private Date subEndDate;
    @JoinColumn(name="channel_fk")
    @OneToOne
    private Channel channelId;



}
