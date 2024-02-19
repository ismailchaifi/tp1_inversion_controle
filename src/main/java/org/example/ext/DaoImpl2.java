package org.example.ext;

import org.example.dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteurs");
        return 80;
    }
}
