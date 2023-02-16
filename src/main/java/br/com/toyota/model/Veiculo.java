package br.com.toyota.model;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Veículos")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sq_veiculo")
    @SequenceGenerator(name = "sq_veiculo", allocationSize = 1,  sequenceName = "sq_veiculo", initialValue = 1)
    private Long id;
    private String marca;
    private String cor;
    private String modelo;
    private BigDecimal preco;

    public Veiculo(Long id, String marca, String cor, String modelo, BigDecimal preco) {
        this.id = id;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.preco = preco;
    }

    public Veiculo() {
    }


    public Long getId() {
        return id;
    }

    public Veiculo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public Veiculo setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getCor() {
        return cor;
    }

    public Veiculo setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public Veiculo setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Veiculo setPreco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }




}



