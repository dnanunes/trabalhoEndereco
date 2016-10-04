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
@Table(name = "logradouro")
public class Logradouro implements Serializable 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long bairroId;
    
    private String nome;

    public Long getBairroId() {
        return bairroId;
    }

    public void setBairroId(Long bairroId) {
        this.bairroId = bairroId;
    }
    
    private String tipo;

    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   
    
    
}
