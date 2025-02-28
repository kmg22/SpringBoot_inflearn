package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded // 내장 type 표기
    private Address address;

    @OneToMany(mappedBy = "member") // order table의 member에 의해 맵핑 됨
    private List<Order> orders = new ArrayList<>();

}
