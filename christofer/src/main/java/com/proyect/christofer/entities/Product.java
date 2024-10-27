package com.proyect.christofer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "producto") // Nombre de la tabla en la base de datos
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto") // Mapea al nombre de columna en la tabla
    private Long id;

    @Column(name = "nombre", nullable = false) // Mapea al nombre de columna en la tabla
    private String name;

    @Column(name = "codigo", unique = true, nullable = false) // Mapea al nombre de columna en la tabla
    private String code;

    @Column(name = "imagen") // Mapea al nombre de columna en la tabla
    private String image;

    @Column(name = "precio", nullable = false) // Mapea al nombre de columna en la tabla
    private Double price;

    // Constructor vacío (requerido por JPA)
    public Product() {
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                '}';
    }
}
