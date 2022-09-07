package PatikaOdev;

import java.sql.SQLOutput;
import java.util.*;

public class MacFiksturOdevi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> teams = new ArrayList<>();

        System.out.println("Takım sayısını giriniz.");
        int numOfTeams = in.nextInt(); // kaç takımın yer alacağı girildi.

        for(int i=0;i<numOfTeams;i++){
            // takımlari aldık ve dizimize girdik.
            String t = in.next();
            teams.add(t);
        }

        if(numOfTeams%2!=0){
            teams.add("Bay");
        }

        List<Integer[]> a = new ArrayList<>();
        for(int i=0;i<teams.size();i++){
            for(int j=0;j<teams.size();j++){
                if(i!=j){
                    Integer[] arr = {i,j};
                    a.add(arr);
                }
            }
        }

    }
}
