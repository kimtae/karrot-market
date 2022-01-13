package site.karrot.server.customException.productException;

import lombok.Getter;

@Getter
public enum ProductErrorCode {
    NOT_FOUND_PRODUCT("상품 게시글을 찾지 못했습다.");

    //에러 메시지
    private final String message;

    ProductErrorCode(String message) {
        this.message = message;
    }
}
