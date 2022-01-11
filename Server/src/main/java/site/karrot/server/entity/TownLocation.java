package site.karrot.server.entity;

import javax.persistence.*;

@Entity
public class TownLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String townLocation;

    @ManyToOne
    @JoinColumn(name = "cityLocationId", nullable = false)
    private CityLocation cityLocation;

}
