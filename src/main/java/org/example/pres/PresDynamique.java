package org.example.pres;

import org.example.dao.IDao;
import org.example.metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresDynamique {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("config.txt"));

        String daoClassName = sc.nextLine();
        Class<?> cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getConstructor().newInstance();

        String metierClassName = sc.nextLine();
        Class<?> cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

        Method method = cMetier.getMethod("setDao", IDao.class);
        method.invoke(metier, dao);

        System.out.println(metier.calcul());
    }
}
