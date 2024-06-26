package sk.stuba.fei.uim.oop.assignment3.product.logic;

import sk.stuba.fei.uim.oop.assignment3.exception.IllegalOperationException;
import sk.stuba.fei.uim.oop.assignment3.exception.NotFoundException;
import sk.stuba.fei.uim.oop.assignment3.product.data.Product;
import sk.stuba.fei.uim.oop.assignment3.product.web.bodies.ProductRequest;
import sk.stuba.fei.uim.oop.assignment3.product.web.bodies.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    Product create(ProductRequest request);

    Product getById(long id) throws NotFoundException;

    Product update(long id, ProductUpdateRequest request) throws NotFoundException;

    void delete(long id) throws NotFoundException;

    int getProductAmount(long id) throws NotFoundException;

    int addProductAmount(long id, int Amount) throws NotFoundException;

    public void removeProductAmount(long id, int amount) throws NotFoundException, IllegalOperationException;

}
