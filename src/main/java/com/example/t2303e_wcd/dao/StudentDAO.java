package com.example.t2303e_wcd.dao;
import com.example.t2303e_wcd.database.Database;
import com.example.t2303e_wcd.entity.Student;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements DAOInterface<Student>{
    @Override
    public List<Student> all() {
        String sql = "SELECT * FROM students";
        ArrayList<Student> list = new ArrayList<>();
        try {
            Database db = Database.createInstance();
            ResultSet rs = db.getStatement().executeQuery(sql);
            while (rs.next()){
                list.add(new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("telephone"),
                        rs.getInt("class_id")
                ));
            }
        }catch (Exception e){

        }
        return list;
    }

    @Override
    public boolean create(Student student) {
        return false;
    }

    @Override
    public boolean update(Student student) {
        return false;
    }

    @Override
    public boolean delete(Student student) {
        return false;
    }

    @Override
    public <K> Student find(K id) {
        return null;
    }

}