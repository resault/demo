package com.example.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Ordr {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;

	@OneToMany(mappedBy = "order")
	private List<OrderItem> orderItemList = new ArrayList<>();

	@OneToOne
	@JoinColumn(name = "delivery_id")
	private Delivery delivery;

	private Date orderDate;

	@Enumerated(EnumType.STRING)
	private OrderStatus status;

}
