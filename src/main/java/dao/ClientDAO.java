package dao;

import entity.Client;

import java.sql.SQLException;
import java.util.List;

public interface ClientDAO {

    //create
    void add(Client client) throws SQLException;

    //read
    List<Client> getAll() throws SQLException;

    Client getBuId(int id) throws  SQLException;

    //update
    void update(Client client) throws SQLException;

    //delete
    void remove(Client client) throws  SQLException;

}
