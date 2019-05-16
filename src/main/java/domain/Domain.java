package domain;

import bl.HibernateUtil;
import entity.Client;
import entity.Pet;
import org.hibernate.Session;
import service.ClientService;
import service.PetService;

import java.sql.SQLException;

public class Domain {
    public static void main(String[] args) throws SQLException {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//          Client client = new Client("Miha","Minsk");
////        client.setName("Vov");
////        client.setAdress("Gome");
//          Pet pet = new Pet("Bobi");
////        pet.setNic("Bo");
//        session.save(client);
//        session.save(pet);
//        session.getTransaction().commit();
//        HibernateUtil.shultdown();
        ClientService clientService = new ClientService();
        PetService petService = new PetService();

        Client client = new Client("Kola","Jlobin");

        Pet pet = new Pet("Nicon");

        clientService.add(client);
        petService.add(pet);

        HibernateUtil.shultdown();



    }
}
