package dao;



import entity.Pet;

import java.sql.SQLException;
import java.util.List;

public interface PetDAO {

    //create
    void add(Pet pet) throws SQLException;

    //read
    List<Pet> getAll() throws SQLException;

    Pet getBuId(int id) throws  SQLException;

    //update
    void update(Pet pet) throws SQLException;

    //delete
    void remove(Pet pet) throws  SQLException;


}
