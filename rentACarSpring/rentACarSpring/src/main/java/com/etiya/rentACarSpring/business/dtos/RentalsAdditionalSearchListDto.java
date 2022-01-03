package com.etiya.rentACarSpring.business.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RentalsAdditionalSearchListDto {
    private int id;
    private int rentalId;
    private int additionalId;
    private int price;
}
