package api.domashop.beta.myShop.domain;

import api.domashop.beta.common.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "myshops")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MyShop extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "my_shop_id", unique = true, nullable = false)
    private Long myShopId;

    @Column(name = "deposit_amount")
    private String depositAmount;

    @Column(name = "coupon")
    private String coupon;

    @Column(name = "total_order_amount")
    private String totalOrderAmount;

    @Column(name = "delivery_status")
    private String deliveryStatus;

}
