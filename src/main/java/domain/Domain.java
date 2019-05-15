package domain;

import bl.HibernateUtil;
import entity.Client;
import entity.Pet;
import org.hibernate.Session;

public class Domain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Client client = new Client();
        client.setName("Vova");
        client.setAdress("Gomel");

        Pet pet = new Pet();
        pet.setNic("Bob");



        session.save(client);
        session.save(pet);

        session.getTransaction().commit();
        HibernateUtil.shultdown();
    }
}
