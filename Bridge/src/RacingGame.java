public class RacingGame extends Game{

    public RacingGame(Developer developer){
        super(developer);
    }

    @Override
    public void develop(){
        System.out.println("Racing game development started");
        developer.writeCode();
    }

}
