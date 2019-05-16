package service;

import bl.SessionUtil;
import dao.ClientDAO;
import entity.Client;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.SQLException;
import java.util.List;

public class ClientService extends SessionUtil implements ClientDAO {


    //откр сессию и транзакцию
    public void add(Client client) throws SQLException {
        opnenTransactionSession();

        Session session = getSession();
        session.save(client);

        //закрываем
        closeTransactionSession();
    }

    public List<Client> getAll() throws SQLException {
        opnenTransactionSession();

        String sql = "SELECT * FROM CLIENT";

        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Client.class);
        List<Client> clientList = query.list();

        closeTransactionSession();

        return clientList;
    }

    public Client getBuId(int id) throws SQLException {
        opnenTransactionSession();

        String sql = "SELECT * FROM CLIENT WHERE ID = id";

        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Client.class);
        query.setParameter("id",id);

        Client client = (Client) query.getSingleResult();
        closeTransactionSession();
        return client;

    }

    public void update(Client client) throws SQLException {

        opnenTransactionSession();

        Session session = getSession();
        session.update(client);

        closeTransactionSession();

    }

    public void remove(Client client) throws SQLException {

        opnenTransactionSession();

        Session session = getSession();
        session.remove(client);

        closeTransactionSession();

    }

}
