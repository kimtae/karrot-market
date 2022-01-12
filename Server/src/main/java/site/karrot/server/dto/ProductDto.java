package site.karrot.server.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ProductDto {

    @Getter
    @Setter
    @Builder
    @ToString
    public static class Request{
        private String productCategory;

        private String title;

        private String content;

        private Boolean isBought;
    }
}
