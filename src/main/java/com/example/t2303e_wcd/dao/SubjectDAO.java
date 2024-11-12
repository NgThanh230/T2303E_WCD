package com.example.t2303e_wcd.dao;

import com.example.t2303e_wcd.entity.Subject;

import java.util.List;

public class SubjectDAO implements DAOInterface<Subject> {
    @Override
    public List<Subject> all() {
        return null;
    }

    @Override
    public boolean create(Subject subject) {
        return false;
    }

    @Override
    public boolean update(Subject subject) {
        return false;
    }

    @Override
    public boolean delete(Subject subject) {
        return false;
    }

    @Override
    public <K> Subject find(K id) {
        return null;
    }
}