package iso2ControlManager;

import iso2ControlManager.ui.ResizeHelper;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Dimension2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.annotation.PostConstruct;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Author: Starikov Vyacheslav
 * Department: 8011
 * Date: 21.01.19 10:45
 */
public class ISO2ControlManager extends Application{
    private static Stage primaryStage;
    private static String TITLE ="Комплекс управления и функционального контроля СЕВ, v" + CFG.VERSION;
    private double dragOffsetX;
    private double dragOffsetY;
    private double defaultWidth = 1300;
    private double defaultHeight = 800;


    public static void main(String[] args) {
        launch(args);
    }



    //Инициализация компонентов JavaFX
    @FXML
    private Label versionLbl;

    @FXML
    private Button expandMainBtn;

    @FXML
    private Button fullScreenMainBtn;

    @FXML
    private Button closeMainBtn;


    //Инициализация методов интерфейса слушателя для компонентов JavaFX
    @FXML
    void onCloseMainBtn(ActionEvent event) {
        primaryStage.close();
        Platform.exit();
    }

    @FXML
    void onExpandMainBtn(ActionEvent event) {
        primaryStage.setIconified(true);
    }

    @FXML
    private HBox topPane;

    @FXML
    void onFullScreenMainBtn(ActionEvent event) {
        if (primaryStage.isMaximized()){
         primaryStage.setMaximized(false);
        } else {
            primaryStage.setMaximized(true);
        }
    }

    @FXML
    public void initialize() {
        draggingStage();
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/controlManager.fxml"));

        Scene scene = new Scene(root, primaryStage.getWidth(), primaryStage.getHeight());
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        ResizeHelper.addResizeListener(primaryStage);
        primaryStage.show();




    }

    //----------------------------Decorate------------------------
    public void draggingStage(){

        topPane.setOnMousePressed(this::handleMousePressed);
        topPane.setOnMouseReleased(this::handleMouseReleased);
        topPane.setOnMouseDragged(this::handleMouseDragged);
    }
    protected void handleMousePressed(MouseEvent e) {
        this.dragOffsetX = e.getScreenX() - primaryStage.getX();
        this.dragOffsetY = e.getScreenY() - primaryStage.getY();
    }

    protected void handleMouseDragged(MouseEvent e) {

        primaryStage.setX(e.getScreenX() - this.dragOffsetX);
        primaryStage.setY(e.getScreenY() - this.dragOffsetY);
        primaryStage.setOpacity(0.5);


        if (primaryStage.isMaximized()){
            primaryStage.setMaximized(false);
        }
    }

    protected void handleMouseReleased(MouseEvent e){
        primaryStage.setOpacity(1);
        if (e.getScreenY() == 0) {
            primaryStage.setMaximized(true);
        }
    }


}
