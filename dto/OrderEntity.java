package com.supertiles.ecommerce.dto;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId; // optional

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address shippingAddress;

    private BigDecimal amount;

    private String currency; // e.g. "INR"

    private String paymentStatus; // PENDING, SUCCESS, FAILED

    private String paymentGatewayOrderId; // id from gateway if available

    private LocalDateTime createdAt;
}

