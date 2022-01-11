package site.karrot.server.entity;

import javax.persistence.*;

@Entity
public class ProductComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "userActivityId", nullable = false)
    private UserActivity userActivity;

    @ManyToOne
    @JoinColumn(name = "productIdx", nullable = false)
    private Product product;

    @Column(nullable = false)
    private String comment;
}
