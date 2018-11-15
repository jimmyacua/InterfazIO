import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Inter inter = new Inter();
        Simulador simulator = new Simulador(55,66);
        //simulator.Simular();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
