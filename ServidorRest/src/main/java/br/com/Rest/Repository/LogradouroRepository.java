
package br.com.Rest.Repository;

import br.com.Rest.model.Logradouro;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author danilo
 */
@RepositoryRestResource(collectionResourceRel = "Logradouro", path = "logradouros")
public interface LogradouroRepository extends PagingAndSortingRepository<Logradouro, Long>
{
        /**
         * Método que retorna uma lista de clientes fazendo a busca pelo nome passado como parâmetr
         *  
         * @param name
         * @return lista de clientes  

         */
        List<Logradouro> findByNome(@Param("name") String name);

        
        /**
         * Método que retorna o cliente com apenas seu nome fazendo a busca com o id passado como p
         * 
         * @param id
         * @return cliente do id passado como parâmetro.
         */   
        @Query("SELECT l.nome FROM Logradouro l where l.id = :id") 
      Logradouro findNomeById(@Param("id") Long id);
        
        /**
         * Método que retorna uma lista de clientes fazendo a busca pelo nome passado como parâmetr
         * clientes pelo nome.
         *  
         * @param name
         * @return lista de clientes
         */
        List<Logradouro> findByNomeOrderByNome(@Param("name") String name);
    
    
    
    
    
}
