package org.example.ext;

import org.example.dao.IDao;
import org.springframework.stereotype.Repository;

@Repository("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteurs");
        return 80;
    }
}
