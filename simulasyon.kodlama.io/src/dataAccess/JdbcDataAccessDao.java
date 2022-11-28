package dataAccess;

import entities.Category;
import entities.Instructor;
import entities.Product;

public class JdbcDataAccessDao implements ProductDao,CategoryDao,InstructorDao {
    public void add(Product product) {
        System.out.println("JDBC İle Veri Tabanına Eklendi:"+product.getCourseName());

    }

    public void add(Category category) {
        System.out.println("JDBC İle Veri Tabanına Eklendi:"+category.getCategoryName());

    }

    public void add(Instructor instructor) {
        System.out.println("JDBC İle Veri Tabanına Eklendi:"+instructor.getInstructorName());

    }
}