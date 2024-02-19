package org.example.metier;

import org.example.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl() {
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp = dao.getData();
        return tmp*540 / Math.cos(tmp*Math.PI);
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
