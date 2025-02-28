package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Delivery {
    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    // 나중 확장을 위해 EnumType은 꼭 String으로!
    // (Ordinal은 숫자로 되는데, 중간에 새로운 상태 생기면 다 밀리게 됨)
    private DeliveryStatus status; // READY, COMP
}
