package com.Models.BaseClass.channel;

import javax.persistence.*;

/**
 * Created by mepesh on 10/26/2017.
 */
@Entity
@Table(name="channel")
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long channelId;
    private String channelName;
    private Boolean isActive;

    public Channel() {
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
