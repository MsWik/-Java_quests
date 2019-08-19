package by.peleng.DAO;

import by.peleng.DAO.data.connect.DataBaseHelper;
import by.peleng.DAO.data.subject.Galahies;
import by.peleng.DAO.data.subject.Planets;
import by.peleng.DAO.data.subject.Satelites;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestMain1 {
    public static void main(String[] args) {
/*        ArrayList<Galahies> list = new ArrayList<Galahies>() {
            {
                add(new Galahies(3, "ESO 137—001", "Мало"));
                add(new Galahies(4, "NGC 3314B", "Нет"));
            }
        };*/


            GalaxiesDAO galaxiesDAO = null;
            PlanetsDAO planetsDAO=null;
            SatellitesDAO satellitesDAO=null;
            TestDAO testDAO=null;
            PreparedStatement statement = null;
            try {

                galaxiesDAO = new GalaxiesDAO();
                planetsDAO = new PlanetsDAO();
                satellitesDAO = new SatellitesDAO();


                List<Galahies> list = galaxiesDAO.findAll();
                List<Planets> listPlanets = planetsDAO.findAll();
                List<Satelites> satelitesList=satellitesDAO.findAll();

                for (Galahies galahies : list) {
                    System.out.println(galahies.toString());
                }
                for (Planets planets : listPlanets) {
                    System.out.println(planets.toString());
                }
                for (Satelites satelites : satelitesList) {
                    System.out.println(satelites.toString());
                }
            } finally {

            }
            System.out.println("----------------");
            System.out.println(" Вывести информацию обо всех планетах, на которых присутствует\n" +
                    "            жизнь, и их спутниках в заданной галактике");
            System.out.println("----------------");
            System.out.println("----------------");
        try {
/*            Вывести информацию обо всех планетах, на которых присутствует
            жизнь, и их спутниках в заданной галактике.*/
            galaxiesDAO = new GalaxiesDAO();
            galaxiesDAO.SQL_SELECT_ALL_GALAHIES="SELECT * FROM universe.galaxies where idgalaxies=1;";
            planetsDAO = new PlanetsDAO();
        /*  testDAO=new TestDAO();
            testDAO.filnAll("SELECT * FROM `universe`.`planets` where life=1 and galaxies_idgalaxies=1;");*/


            planetsDAO.SQL_SELECT_ALL_PLANETS="SELECT * FROM `universe`.`planets` where life=1 and galaxies_idgalaxies=1;";
            satellitesDAO = new SatellitesDAO();
            satellitesDAO.SQL_SELECT_ALL_SATELITES="SELECT p.idsatellites,p.name,p.radius,p.distance,p.Planets_idPlanets," +
                    "p.Planets_galaxies_idgalaxies FROM universe.satellites p, universe.planets z where p.Planets_galaxies_idgalaxies=1 and z.life=1 and p.Planets_idPlanets=z.idPlanets;";

            List<Galahies> list = galaxiesDAO.findAll();
            List<Planets> listPlanets = planetsDAO.findAll();
            List<Satelites> satelitesList=satellitesDAO.findAll();

            for (Galahies galahies : list) {
                System.out.println(galahies.toString());
            }
            for (Planets planets : listPlanets) {
                System.out.println(planets.toString());
            }
            for (Satelites satelites : satelitesList) {
                System.out.println(satelites.toString());
            }
        } finally {

        }
        System.out.println("----------------");
        System.out.println("  Вывести информацию о планетах и их спутниках, имеющих наимень-\n" +
                "ший радиус и наибольшее количество спутников.");
        System.out.println("----------------");
        System.out.println("----------------");
        try {
/*          Вывести информацию о планетах и их спутниках, имеющих наимень-
ший радиус и наибольшее количество спутников.*/
            galaxiesDAO = new GalaxiesDAO();
            galaxiesDAO.SQL_SELECT_ALL_GALAHIES="SELECT * FROM universe.galaxies where idgalaxies=1;";
            planetsDAO = new PlanetsDAO();
           //
           // testDAO.filnAll("SELECT * FROM universe.planets where radius=(select min(radius) from universe.planets) and satellites=(select max(satellites) from universe.planets);");
            planetsDAO.SQL_SELECT_ALL_PLANETS="SELECT * FROM universe.planets where radius=(select min(radius) from universe.planets) and satellites=(select max(satellites) from universe.planets);";
            satellitesDAO = new SatellitesDAO();
            satellitesDAO.SQL_SELECT_ALL_SATELITES="SELECT p.idsatellites,p.name,p.radius,p.distance,p.Planets_idPlanets, p.Planets_galaxies_idgalaxies FROM universe.satellites p, universe.planets z  where z.radius=(select min(radius) from universe.planets) and z.satellites=(select max(satellites) from universe.planets) and p.Planets_idPlanets=z.idPlanets;";

            List<Galahies> list = galaxiesDAO.findAll();
            List<Planets> listPlanets = planetsDAO.findAll();
            List<Satelites> satelitesList=satellitesDAO.findAll();
/*
            for (Galahies galahies : list) {
                System.out.println(galahies.toString());
            }*/
            for (Planets planets : listPlanets) {
                System.out.println(planets.toString());
            }
            for (Satelites satelites : satelitesList) {
                System.out.println(satelites.toString());
            }
        } finally {

        }
        System.out.println("----------------");
        System.out.println("Найти галактику, сумма ядерных температур планет которой наибольшая.");
        System.out.println("----------------");
        System.out.println("----------------");
        try {
/*        Найти галактику, сумма ядерных температур планет которой наибольшая.*/

            galaxiesDAO = new GalaxiesDAO();
            galaxiesDAO.SQL_SELECT_ALL_GALAHIES="SELECT distinct c.idgalaxies,c.name,c.palanet, sum(z.core_temperature) as sum  FROM universe.galaxies c, universe.planets z where c.idgalaxies=z.galaxies_idgalaxies group by z.galaxies_idgalaxies having sum(z.core_temperature)>=all(select sum(core_temperature) from universe.planets group by galaxies_idgalaxies);";
        //   testDAO.filnAll("SELECT distinct c.idgalaxies,c.name,c.palanet, sum(z.core_temperature) as sum  FROM universe.galaxies c, universe.planets z where c.idgalaxies=z.galaxies_idgalaxies group by z.galaxies_idgalaxies having sum(z.core_temperature)>=all(select sum(core_temperature) from universe.planets group by galaxies_idgalaxies);");

            planetsDAO = new PlanetsDAO();
            planetsDAO.SQL_SELECT_ALL_PLANETS="SELECT * FROM universe.planets where radius=(select min(radius) from universe.planets) and satellites=(select max(satellites) from universe.planets);";
            satellitesDAO = new SatellitesDAO();
            satellitesDAO.SQL_SELECT_ALL_SATELITES="SELECT p.idsatellites,p.name,p.radius,p.distance,p.Planets_idPlanets, p.Planets_galaxies_idgalaxies FROM universe.satellites p, universe.planets z  where z.radius=(select min(radius) from universe.planets) and z.satellites=(select max(satellites) from universe.planets) and p.Planets_idPlanets=z.idPlanets;";

            List<Galahies> list = galaxiesDAO.findAll();
            List<Planets> listPlanets = planetsDAO.findAll();
            List<Satelites> satelitesList=satellitesDAO.findAll();
            for (Galahies galahies : list) {
                System.out.println(galahies.toString());
            }


/*            for (Planets planets : listPlanets) {
                System.out.println(planets.toString());
            }
            for (Satelites satelites : satelitesList) {
                System.out.println(satelites.toString());
            }*/
        } finally {

        }








    }

}
