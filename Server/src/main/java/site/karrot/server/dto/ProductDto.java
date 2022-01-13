package site.karrot.server.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

public class ProductDto {

    @Getter
    @Setter
    @Builder
    @ToString
    public static class Request{

        @NotNull
        private String productCategory;

        @NotNull
        private String title;

        @NotNull
        private String content;

        @NotNull
        private Boolean isBought;
    }

    @Getter
    @Builder
    @ToString
    public static class Response{
        private Long idx;
        private String category;
        private String title;
        private String content;
        private Integer hitCount;
        private Boolean isBought;
        private Boolean isSold;
    }
}
