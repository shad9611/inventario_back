package inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventario.model.Producto;
import inventario.repository.ProductRepository;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Producto> getAllProducts() {
        return this.productRepository.findAll();
    }

    @Override
    public Producto findById(Integer idProduct) {
        return this.productRepository.findById(idProduct).orElse(null);
    }

    @Override
    public void saveProduct(Producto product) {
        this.productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer idProduct) {
        this.productRepository.deleteById(idProduct);
    }

}
