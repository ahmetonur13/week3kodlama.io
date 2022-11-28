package dataAccess;

import entities.Category;
import entities.Instructor;
import entities.Product;

public class HibernateDataAccessDao implements ProductDao,CategoryDao,InstructorDao {
    public void add(Product product) {
        System.out.println("Hibernate İle Veri Tabanına Eklendi:"+product.getCourseUnitPrice());
    }

    public void add(Category category) {
        System.out.println("Hibernate İle Veri Tabanına Eklendi:"+category.getCategoryName());
    }

    public void add(Instructor instructor) {
        System.out.println("Hibernate İle Veri Tabanına Eklendi:"+instructor.getInstructorName());
    }
}