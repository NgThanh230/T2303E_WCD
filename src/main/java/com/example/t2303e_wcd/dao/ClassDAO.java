package com.example.t2303e_wcd.dao;

import com.example.t2303e_wcd.database.Database;
import com.example.t2303e_wcd.entity.Classroom;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClassDAO implements DAOInterface<Classroom> {
    @Override
    public List<Classroom> all() {
        String sql = "SELECT * FROM classes";
        ArrayList<Classroom> list = new ArrayList<>();
        try {
            Database db = Database.createInstance();
            ResultSet rs = db.getStatement().executeQuery(sql);
            while (rs.next()){
                list.add(new Classroom(
                        rs.getInt("id"),
                        rs.getString("name")
                ));
            }
        }catch (Exception e){

        }
        return list;
    }

    @Override
    public boolean create(Classroom classroom) {
        return false;
    }

    @Override
    public boolean update(Classroom classroom) {
        return false;
    }

    @Override
    public boolean delete(Classroom classroom) {
        return false;
    }

    @Override
    public <K> Classroom find(K id) {
        return null;
    }
}