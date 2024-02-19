package org.example.pres;

import org.example.dao.DaoImpl;
import org.example.metier.MetierImpl;

public class PresStatique {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
