package com.example.qtify.Qtify.entity;

import jakarta.persistence.*;
import java.util.Date;

import java.util.List;

@Entity
@Table(name = "album")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long albumId;

    @Column(nullable = false)
    private String name;
    private String description;
    private String totalDuration;
    private Long followers;
    private String coverImage;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Song> songs;

    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    private Float userRating;


}
