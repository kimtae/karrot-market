package site.karrot.server.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @OneToOne
    @JoinColumn(name = "userActivityId")
    private UserActivity userActivity;

    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "locaionId", nullable = false)
    private Location location;

    @OneToMany
    @JoinColumn(name = "productImgUrlId")
    List<ProductImgUrl> productImgUrls = new ArrayList<>();

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Integer hitCount;

    @Column(nullable = false)
    private Boolean isBought;

    @Column(nullable = false)
    private Boolean isSold;


}
