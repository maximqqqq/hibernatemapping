package service;

import bl.SessionUtil;
import dao.ClientDAO;
import dao.PetDAO;
import entity.Client;
import entity.Pet;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.SQLException;
import java.util.List;

public class PetService extends SessionUtil implements PetDAO {


    public void add(Pet pet) throws SQLException {
        opnenTransactionSession();

        Session session = getSession();
        session.save(pet);

        //закрываем
        closeTransactionSession();
    }

    public List<Pet> getAll() throws SQLException {
        opnenTransactionSession();

        String sql = "SELECT * FROM PET";

        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Client.class);
        List<Pet> petList = query.list();

        closeTransactionSession();

        return petList;
    }

    public Pet getBuId(int id) throws SQLException {
        opnenTransactionSession();

        String sql = "SELECT * FROM PET WHERE ID = id";

        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Pet.class);
        query.setParameter("id",id);

        Pet pet = (Pet) query.getSingleResult();
        closeTransactionSession();
        return pet;
    }

    public void update(Pet pet) throws SQLException {
        opnenTransactionSession();

        Session session = getSession();
        session.update(pet);

        closeTransactionSession();

    }

    public void remove(Pet pet) throws SQLException {
        opnenTransactionSession();

        Session session = getSession();
        session.remove(pet);

        closeTransactionSession();
    }
}
