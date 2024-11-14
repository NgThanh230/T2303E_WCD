package wcd.entity.repository;

import wcd.entity.Classroom;

import java.util.List;

public interface ClassroomRepository {
    List<Classroom> findAll ;
    void save(Classroom classroom);
    Classroom findById(int id);
    void update(Classroom classroom);
    void delete(int id);
}
