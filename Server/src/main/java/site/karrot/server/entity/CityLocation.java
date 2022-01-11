package site.karrot.server.entity;

import javax.persistence.*;

@Entity
public class CityLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String CityLocation;
}
