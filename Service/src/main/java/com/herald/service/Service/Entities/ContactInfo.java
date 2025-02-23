package com.herald.service.Service.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContactInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false, length = 100)
    private String email;
    @Column(nullable = false)
    private String socialNetworkId;
    @Column(nullable = false)
    private SocialNetworkEnum socialNetwork;
    @Column(nullable = false, length = 15)
    private String number;
    @ManyToOne
    private Organizer organizer;
}
