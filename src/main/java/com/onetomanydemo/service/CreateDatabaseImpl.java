package com.onetomanydemo.service;

import com.onetomanydemo.domain.Category;
import com.onetomanydemo.domain.Products;
import com.onetomanydemo.repository.CategoryRepository;
import com.onetomanydemo.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateDatabaseImpl implements ICreateDatabase {
    @Autowired
    private ProductsRepository productsRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void createDatabase() {
        Category c1 = new Category("Meat");
        Category c2 = new Category("Fruits");git

        Products p1 = new Products("Chicken", 23, 10000);
        Products p2 = new Products("Fish", 22, 15000);
        Products p3 = new Products("Apple", 25, 20000);
        Products p4 = new Products("Orange", 26, 30000);

        c1.getProducts().add(p1);
        c1.getProducts().add(p2);

        c2.getProducts().add(p3);
        c2.getProducts().add(p4);

        categoryRepository.save(c1);
        categoryRepository.save(c2);
    }
}
