package api.domashop.beta.itemBoard.domain;

import api.domashop.beta.common.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "item_boards")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemBoard extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_board_id", unique = true, nullable = false)
    private Long itemBoardId;

    @Column(name  = "title")
    private String title;

    @Column(name = "selling_price")
    private String sellingPrice;

    @Column(name = "recommended_selling_price")
    private String recommendedSellingPrice;

    @Column(name = "content")
    private String content;

    @Column(name = "item_purchase_information")
    private String itemPurchaseInformation;

    @Column(name = "review")
    private String review;

    @Column(name = "inquire")
    private String inquire; // 문의

}
