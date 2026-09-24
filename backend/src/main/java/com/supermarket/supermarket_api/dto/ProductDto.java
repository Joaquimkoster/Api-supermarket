package com.supermarket.supermarket_api.dto;

import jakarta.validation.constraints.NotBlank;

@Schema(description = "Product data transfer object")
public  class ProductDto {
    @Schema(description = "Unique identifer of the product", example= "1", accesMode = Schema.accesMode.READ_ONLY)
    private Long id;

    @NotBlank (message = "Name is requiered")
    @Size(min = 2, max = 50, message = "name must be between 2 and 50 characters")
    @Schema(description = "Name of the product", example = "Notebook")
    private String name;
}