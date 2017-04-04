package GUI;

import CLI.System;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.IOException;

/**
 * Project Saboteur
 * Created by TonyZheng on 29/3/17.
 */
public class BoardController extends Application {

    private Stage primaryStage;
    private static BorderPane mainLayout;

    /**
     * GUI load main method.
     *
     * @param primaryStage
     * @throws IOException
     */
    @Override
    public void start( Stage primaryStage ) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Saboteur");
        showBoard();
        setCenter();
    }

    /**
     * Load the main board
     *
     * @throws IOException
     */
    private void showBoard() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(BoardController.class.getResource("MainMenu.fxml"));
        mainLayout = loader.load();
        Scene scene = new Scene(mainLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * load the board that show the main game board
     *
     * @throws IOException
     */
    private void setCenter() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(BoardController.class.getResource("Board.fxml"));
        AnchorPane mainCenter = loader.load();
        mainLayout.setCenter(mainCenter);
    }

    @FXML
    public TextField PlayerNum;

    @FXML
    public TextField GoldNum;

    @FXML
    public TextArea Introduction;

    @FXML
    public Pane card0101;
    @FXML
    public Pane card0201;
    @FXML
    public Pane card0102;
    @FXML
    public Pane card0202;
    @FXML
    public Pane card0103;
    @FXML
    public Pane card0203;
    @FXML
    public Pane card0104;
    @FXML
    public Pane card0204;
    @FXML
    public Pane card0105;
    @FXML
    public Pane card0205;
    @FXML
    public Pane card0106;
    @FXML
    public Pane card0206;
    @FXML
    public Pane card0107;
    @FXML
    public Pane card0207;
    @FXML
    public Pane card0108;
    @FXML
    public Pane card0208;


    /**
     * This method switch the Pane card into card number
     *
     * @param card Pane
     * @return int[]
     */
    private int[] switchCardNum( Pane card ) {
        int x;
        int y;
        int[] ints = new int[2];
        if (card == card0101) {
            x = 1;
            y = 1;
        } else if (card == card0201) {
            x = 2;
            y = 1;
        } else if (card == card0102) {
            x = 1;
            y = 2;
        } else if (card == card0202) {
            x = 2;
            y = 2;
        } else if (card == card0103) {
            x = 1;
            y = 3;
        } else if (card == card0203) {
            x = 2;
            y = 3;
        } else if (card == card0104) {
            x = 1;
            y = 4;
        } else if (card == card0204) {
            x = 2;
            y = 4;
        } else if (card == card0105) {
            x = 1;
            y = 5;
        } else if (card == card0205) {
            x = 2;
            y = 5;
        } else if (card == card0106) {
            x = 1;
            y = 6;
        } else if (card == card0206) {
            x = 2;
            y = 6;
        } else if (card == card0107) {
            x = 1;
            y = 7;
        } else if (card == card0207) {
            x = 2;
            y = 7;
        } else if (card == card0108) {
            x = 1;
            y = 8;
        } else {
            x = 2;
            y = 8;
        }
        ints[0] = x;
        ints[1] = y;
        return ints;
    }

    /**
     * This method generate the Image URL using Pane card
     *
     * @param card Pane
     * @return String URL
     */
    public String getURL( Pane card ) {
        int[] ints;
        ints = switchCardNum(card);
        String URL = "CardImage" + ints[0] + ints[1] + ".jpg";
        return URL;
    }

    /**
     * this method is Generate Bottom method, click to generate
     */
    @FXML
    public void setNum() {
        if (PlayerNum.getText() != null && GoldNum.getText() != null) {
            int player = Integer.parseInt(PlayerNum.getText());
            int gold = Integer.parseInt(GoldNum.getText());
            System.enterPlayers(player);
            System.setGold(gold);
        } else {
            Introduction.setText("Please enter player number or gold number");
        }

    }

    @FXML
    public void dragDetected( MouseEvent event ) {
        Dragboard db = card0101.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(new Image(getURL(card0101)));
        db.setContent(cb);
        event.consume();
    }
}
