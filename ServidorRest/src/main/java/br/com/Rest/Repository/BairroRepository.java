
package br.com.Rest.Repository;

import br.com.Rest.model.Bairro;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author danilo
 */
@RepositoryRestResource(collectionResourceRel = "Bairro", path = "bairros")
public interface BairroRepository extends PagingAndSortingRepository<Bairro, Long>
{
        /**
         * Método que retorna uma lista de clientes fazendo a busca pelo nome passado como parâmetr
         *  
         * @param name
         * @return lista de clientes  

         */
        List<Bairro> findByNome(@Param("name") String name);

        
        /**
         * Método que retorna o cliente com apenas seu nome fazendo a busca com o id passado como p
         * 
         * @param id
         * @return cliente do id passado como parâmetro.
         */   
        @Query("SELECT b.nome FROM Bairro b where b.id = :id") 
      Bairro findNomeById(@Param("id") Long id);
        
        /**
         * Método que retorna uma lista de clientes fazendo a busca pelo nome passado como parâmetr
         * clientes pelo nome.
         *  
         * @param name
         * @return lista de clientes
         */
        List<Bairro> findByNomeOrderByNome(@Param("name") String name);
    
    
    
    
    
}
