import io.Console;
import services.CatFoodService;

public class App {

    private CatFoodService catFoodService = new CatFoodService(); //create services needed to manage inventory

    public static void main(String[] args) {
        App application = new App(); //instantiate application
        application.init(); //call a method to initialize (init) application
    }

    public void init() {

        Console.printWelcome();
    }
}
