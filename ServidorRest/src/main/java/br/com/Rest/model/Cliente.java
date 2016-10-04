
package br.com.Rest.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author danilo
 */

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable
{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String endereco;
    private String cpf;
    
    @OneToMany(targetEntity = Compra.class, fetch = FetchType.EAGER)
    @JoinColumn(name= "clienteId")
    private List<Compra> compra;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Compra> getCompras() {
        return compra;
    }

    public void setCompras(List<Compra> compras) {
        this.compra = compras;
    }
    
    
    
    
    
    
    
    
    
    
}
