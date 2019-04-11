package IMS.demo.dto;

import IMS.demo.dataobject.OrderDetail;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class PurchaseDTO {
    private String purchaseId;
    private String note;
    private LocalDateTime createTime;
    List<TradeGoodsDTO> goodsList;
}
