package br.com.Rest.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author danilo
 */
@Entity
@Table(name = "compra")
public class Compra implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private Long clienteId;
    private float valorTotal;
    private int numeroProdutos;

    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getNumeroProdutos() {
        return numeroProdutos;
    }

    public void setNumeroProdutos(int numeroProdutos) {
        this.numeroProdutos = numeroProdutos;
    }
    
    






























    
}
