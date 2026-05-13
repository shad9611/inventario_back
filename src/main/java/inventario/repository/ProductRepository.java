package inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import inventario.model.Producto;

@Repository
public interface ProductRepository extends JpaRepository<Producto, Integer> {

}
