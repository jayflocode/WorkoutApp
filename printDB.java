package hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class printDB extends  DaysEntity {


    public  void main(String[] args) throws Exception {

        SqlConnect.print();




    }
}
