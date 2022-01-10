package site.karrot.server.entity;

import javax.persistence.*;

@Entity
public class ProductLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userActivityId", nullable = false)
    private UserActivity userActivity;

    @ManyToOne
    @JoinColumn(name = "productIdx", nullable = false)
    private Product product;

}
