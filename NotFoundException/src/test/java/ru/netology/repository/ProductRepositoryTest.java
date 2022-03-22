package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.NotFoundException;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    Product first = new Product(11,"first",10);
    Product second = new Product(115,"second",111);
@Test
    public void shouldRemoveById(){

        ProductRepository repo = new ProductRepository();
        repo.save(first);
        repo.save(second);

        repo.removeById(115);
    }

    @Test
    public  void shouldRemoveByNegativeID(){

        ProductRepository repo = new ProductRepository();
        repo.save(first);
        repo.save(second);

        assertThrows(NotFoundException.class, () ->{
                    repo.removeById(115);
                });


    }

}