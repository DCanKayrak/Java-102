package PatikaOdev.Fikstur;

public class Main {
    public static void main(String[] args) {
        Teams teams = new Teams();

        teams.addTeam("GS");
        teams.addTeam("FB");
        teams.addTeam("BJK");
        teams.addTeam("TS");

        teams.run();
    }
}
