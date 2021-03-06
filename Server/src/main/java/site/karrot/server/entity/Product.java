package site.karrot.server.entity;

import lombok.Getter;
import site.karrot.server.dto.ProductDto;

import javax.persistence.*;

@Entity
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

//    @OneToOne
//    @JoinColumn(name = "userActivityId")
//    private UserActivity userActivity;

    @ManyToOne
    @JoinColumn(name = "productCategoryId", nullable = false)
    private ProductCategory productCategory;

//    @ManyToOne
//    @JoinColumn(name = "townLocationId", nullable = false)
//    private TownLocation townLocation;
//
//    @OneToMany
//    @JoinColumn(name = "productImgUrlId")
//    List<ProductImgUrl> productImgUrls = new ArrayList<>();

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

    public Product() {

    }

    public Product(ProductDto.Request request, ProductCategory productCategory) {
        this.productCategory = productCategory;
        this.title = request.getTitle();
        this.content = request.getContent();
        this.hitCount = 0;
        this.isBought = request.getIsBought();
        this.isSold = false;
    }


    public void updateProduct(ProductDto.Request request) {
        this.title = request.getTitle();
        this.content = request.getContent();
        this.isBought = request.getIsBought();
        this.isSold = false;
    }
}
