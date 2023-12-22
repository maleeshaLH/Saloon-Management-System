package lk.ijse.gsn;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO<T> {
    ArrayList<T> LoadAll() throws SQLException, ClassNotFoundException ;

    boolean save(T dto) throws SQLException, ClassNotFoundException ;

    boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException ;

    boolean exit(String id) throws SQLException, ClassNotFoundException;

    void delete(String id) throws SQLException, ClassNotFoundException ;

    String  genaretId() throws SQLException, ClassNotFoundException ;
}
