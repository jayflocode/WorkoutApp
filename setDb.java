package hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class setDb   {


    public void dbUpdate() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();


        for (int i = 0; i < Schedule.Monday.length; i++) {

            transaction.begin();
            DaysEntity days = new DaysEntity();

            days.setMonday(Schedule.Monday[i]);
            days.setTuesday(Schedule.Tuesday[i]);
            days.setWednesday(Schedule.Wednesday[i]);
            days.setThursday(Schedule.Thursday[i]);
            days.setFriday(Schedule.Friday[i]);
            days.setSaturday(Schedule.Saturday[i]);
            days.setSunday(Schedule.Sunday[i]);


            entityManager.persist(days);


            transaction.commit();

              entityManager.clear();

        }

        entityManager.close();
        entityManagerFactory.close();


    }

}
