package site.karrot.server.entity;

import javax.persistence.*;

@Entity
public class ProductImgUrl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;

    private String imgUrl;

}
