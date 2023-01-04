package mvc_lecture.dao;

import mvc_lecture.models.Product;

import java.sql.SQLException;
import java.util.List;

public interface Products {
    List<Product> all() throws SQLException; //A method named ALL - goal == to retrieve ALL records

    void insert(Product product); //PERSIST [add] a NEW product object with this method

}
