public class FootballGame extends Game{

    public FootballGame(Developer developer){
        super(developer);
    }

    @Override
    public void develop(){
        System.out.println("Football game development started");
        developer.writeCode();
    }

}
