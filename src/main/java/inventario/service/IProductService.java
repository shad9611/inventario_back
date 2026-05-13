package inventario.service;

import java.util.List;

import inventario.model.Producto;

public interface IProductService {
    List<Producto> getAllProducts();

    Producto findById(Integer idProduct);

    void saveProduct(Producto product);

    void deleteProduct(Integer idProduct);
}
