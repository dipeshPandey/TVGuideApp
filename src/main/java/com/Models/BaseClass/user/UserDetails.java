package com.Models.BaseClass.user;

import com.Models.BaseClass.channel.Channel;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by mepesh on 10/26/2017.
 */
@Entity
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullName;
    private String mobileNo;
    @OneToMany
    private Collection<Channel> userChannel;

}
