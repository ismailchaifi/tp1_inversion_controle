package org.example.dao;

public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("version base de données");
        return Math.random()*40;
    }
}
