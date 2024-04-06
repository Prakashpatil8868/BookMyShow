package com.example.bookmyshow.Models;


import com.example.bookmyshow.Models.enums.PaymentProvider;
import com.example.bookmyshow.Models.enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Payment extends BaseModel{
    private String referenceNumber;
    private int amount;

    @Enumerated(EnumType.ORDINAL)
    private PaymentProvider paymentProvider;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    // I can query by, get all success payments
}