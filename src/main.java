
import Model.group;
import Model.players;
import Model.team;

import javax.swing.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<players> khaley = new ArrayList<>();

        players p1 = new players("Bzulee","17","18","10");
        players p2 = new players("abhinav","17","17","10");
        players p3 = new players("Sushant","17","10","10");
        khaley.add(p1);
        khaley.add(p2);
        khaley.add(p3);

        ArrayList<players> DarjiGang = new ArrayList<>();
        players p4 = new players("Darji","17","12","10");
        players p5 = new players("Aarnov","17","11","10");
        players p6 = new players("Utsav","17","14","10");
        DarjiGang.add(p4);
        DarjiGang.add(p5);
        DarjiGang.add(p6);

        ArrayList<players> Baun = new ArrayList<>();
        players p7 = new players("Avarna","17","15","10");
        players p8 = new players("Pranjal","17","16","10");
        players p9 = new players("Tatsam","17","19","10");
        Baun.add(p7);
        Baun.add(p8);
        Baun.add(p9);


        ArrayList<players> Leday = new ArrayList<>();
        players p10 = new players("Banya","17","18","10");
        players p11 = new players("Adhitya","17","12","10");
        players p12 = new players("Jhot","17","9","10");
        Leday.add(p10);
        Leday.add(p10);
        Leday.add(p10);

        team t1= new team("lother","Red","90",khaley);
        team t2= new team("Brother","Blue","8",DarjiGang);
        team t3= new team("Mother","Green","7",Baun);
        team t4= new team("Frother","White","6",Leday);

        ArrayList<team> TeamA  = new ArrayList<>();
        TeamA.add(t1);
        TeamA.add(t2);

        ArrayList<team> TeamB  = new ArrayList<>();
        TeamA.add(t3);
        TeamA.add(t4);


        group g1= new group("groupA",TeamA);
        group g2= new group("groupB",TeamB);









    }

}