package api.domashop.beta.itemBoard.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Component
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemBoardDto {

    private Long itemBoardId;
    private String title;
    private String sellingPrice;
    private String recommendedSellingPrice;
    private String content;
    private String itemPurchaseInformation;
    private String review;
    private String inquire; // 문의

}
