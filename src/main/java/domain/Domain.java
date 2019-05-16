package domain;

import bl.HibernateUtil;
import entity.Client;
import entity.Pet;
import org.hibernate.Session;

public class Domain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

          Client client = new Client("Miha","Minsk");
//        client.setName("Vov");
//        client.setAdress("Gome");


          Pet pet = new Pet("Bobi");
//        pet.setNic("Bo");



        session.save(client);
        session.save(pet);

        session.getTransaction().commit();
        HibernateUtil.shultdown();
    }
}
