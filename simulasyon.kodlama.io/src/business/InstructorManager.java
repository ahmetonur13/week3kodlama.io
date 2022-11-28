package business;

import core.logger.Logger;
import dataAccess.ProductDao;
import entities.Instructor;



public class InstructorManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public InstructorManager(ProductDao productDao,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }



    public void add(Instructor instructor){

    for(Logger logger:loggers){
        logger.logg(instructor.getInstructorName());
    }
    }



}
