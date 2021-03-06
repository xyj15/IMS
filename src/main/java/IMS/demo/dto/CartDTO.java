package IMS.demo.dto;

import lombok.Data;

/**
 * @author IMS
 * Created on 2017/10/15
 */
@Data
public class CartDTO {

    private String productId;

    private  Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
