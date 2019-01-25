package facadePattern;

/**
 * Created by 59177 on 2017/12/19.
 */
public class TestFacade {
    public static void main(String[] args) {

        Computer computer = new Computer();
        Player player = new Player();
        Light light = new Light();
        Projector projector = new Projector();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(computer, player, light, projector, popper);

        homeTheaterFacade.watchMovie();
    }
}
