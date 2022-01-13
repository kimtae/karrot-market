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
}
