public class Main {
    public static void main(String[] args) {

        Game racingByJava = new RacingGame(new JavaDeveloper());
        racingByJava.develop();

        Game racingByCpp = new RacingGame(new CppDeveloper());
        racingByCpp.develop();

        Game footballByJava = new FootballGame(new JavaDeveloper());
        footballByJava.develop();

        Game footballByCpp = new FootballGame(new CppDeveloper());
        footballByCpp.develop();

    }
}
