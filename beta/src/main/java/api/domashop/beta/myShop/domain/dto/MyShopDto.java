package api.domashop.beta.myShop.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MyShopDto {

    private Long myShopId;
    private String depositAmount;
    private String coupon;
    private String totalOrderAmount;
    private String deliveryStatus;

}
