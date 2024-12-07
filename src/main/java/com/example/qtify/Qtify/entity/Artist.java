package com.example.qtify.Qtify.entity;

import jakarta.persistence.*;
import java.util.UUID;

import java.util.List;

@Entity
@Table(name = "artist")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long artistId;

    private String name;

    private String bio;


    @ManyToMany(mappedBy = "artists")
    private List<Song> songs;


}
