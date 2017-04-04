package GUI;

import CLI.System;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

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
     * @param primaryStage primary Stage
     * @throws IOException IOE
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
     * @throws IOException IOE
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
     * @throws IOException IOE
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
     * These ImageView are the display Image in the Board
     * ImageView Start
     */
    @FXML
    public ImageView image0101;
    @FXML
    public ImageView image0102;
    @FXML
    public ImageView image0103;
    @FXML
    public ImageView image0104;
    @FXML
    public ImageView image0105;
    @FXML
    public ImageView image0106;
    @FXML
    public ImageView image0107;
    @FXML
    public ImageView image0108;
    @FXML
    public ImageView image0109;
    @FXML
    public ImageView image0110;
    @FXML
    public ImageView image0201;
    @FXML
    public ImageView image0202;
    @FXML
    public ImageView image0203;
    @FXML
    public ImageView image0204;
    @FXML
    public ImageView image0205;
    @FXML
    public ImageView image0206;
    @FXML
    public ImageView image0207;
    @FXML
    public ImageView image0208;
    @FXML
    public ImageView image0209;
    @FXML
    public ImageView image0210;
    @FXML
    public ImageView image0301;
    @FXML
    public ImageView image0302;
    @FXML
    public ImageView image0303;
    @FXML
    public ImageView image0304;
    @FXML
    public ImageView image0305;
    @FXML
    public ImageView image0306;
    @FXML
    public ImageView image0307;
    @FXML
    public ImageView image0308;
    @FXML
    public ImageView image0309;
    @FXML
    public ImageView image0310;
    @FXML
    public ImageView image0401;
    @FXML
    public ImageView image0402;
    @FXML
    public ImageView image0403;
    @FXML
    public ImageView image0404;
    @FXML
    public ImageView image0405;
    @FXML
    public ImageView image0406;
    @FXML
    public ImageView image0407;
    @FXML
    public ImageView image0408;
    @FXML
    public ImageView image0409;
    @FXML
    public ImageView image0410;
    @FXML
    public ImageView image0501;
    @FXML
    public ImageView image0502;
    @FXML
    public ImageView image0503;
    @FXML
    public ImageView image0504;
    @FXML
    public ImageView image0505;
    @FXML
    public ImageView image0506;
    @FXML
    public ImageView image0507;
    @FXML
    public ImageView image0508;
    @FXML
    public ImageView image0509;
    @FXML
    public ImageView image0510;
    @FXML
    public ImageView image0601;
    @FXML
    public ImageView image0602;
    @FXML
    public ImageView image0603;
    @FXML
    public ImageView image0604;
    @FXML
    public ImageView image0605;
    @FXML
    public ImageView image0606;
    @FXML
    public ImageView image0607;
    @FXML
    public ImageView image0608;
    @FXML
    public ImageView image0609;
    @FXML
    public ImageView image0610;
    @FXML
    public ImageView image0701;
    @FXML
    public ImageView image0702;
    @FXML
    public ImageView image0703;
    @FXML
    public ImageView image0704;
    @FXML
    public ImageView image0705;
    @FXML
    public ImageView image0706;
    @FXML
    public ImageView image0707;
    @FXML
    public ImageView image0708;
    @FXML
    public ImageView image0709;
    @FXML
    public ImageView image0710;
    @FXML
    public ImageView image0801;
    @FXML
    public ImageView image0802;
    @FXML
    public ImageView image0803;
    @FXML
    public ImageView image0804;
    @FXML
    public ImageView image0805;
    @FXML
    public ImageView image0806;
    @FXML
    public ImageView image0807;
    @FXML
    public ImageView image0808;
    @FXML
    public ImageView image0809;
    @FXML
    public ImageView image0810;
    @FXML
    public ImageView image0901;
    @FXML
    public ImageView image0902;
    @FXML
    public ImageView image0903;
    @FXML
    public ImageView image0904;
    @FXML
    public ImageView image0905;
    @FXML
    public ImageView image0906;
    @FXML
    public ImageView image0907;
    @FXML
    public ImageView image0908;
    @FXML
    public ImageView image0909;
    @FXML
    public ImageView image0910;
    @FXML
    public ImageView image1001;
    @FXML
    public ImageView image1002;
    @FXML
    public ImageView image1003;
    @FXML
    public ImageView image1004;
    @FXML
    public ImageView image1005;
    @FXML
    public ImageView image1006;
    @FXML
    public ImageView image1007;
    @FXML
    public ImageView image1008;
    @FXML
    public ImageView image1009;
    @FXML
    public ImageView image1010;
    /**
     * ImageView End
     */


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
        String URL = "@../../Path/CardImage" + ints[0] + ints[1] + ".jpg";
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

    /**
     * These Method is designed for Drag Image from the Board
     * Drag Method Start
     *
     * @param event event
     */
    @FXML
    public void dragDetected0101( MouseEvent event ) {
        Dragboard db = card0101.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(new Image("/GUI/CardImage11.jpg"));
        db.setContent(cb);
        event.consume();
    }

    @FXML
    public void dragDetected0201( MouseEvent event ) {
        Dragboard db = card0101.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(new Image("/GUI/CardImage21.jpg"));
        db.setContent(cb);
        event.consume();
    }

    @FXML
    public void dragDetected0102( MouseEvent event ) {
        Dragboard db = card0101.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(new Image("/GUI/CardImage12.jpg"));
        db.setContent(cb);
        event.consume();
    }

    @FXML
    public void dragDetected0202( MouseEvent event ) {
        Dragboard db = card0101.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(new Image("/GUI/CardImage22.jpg"));
        db.setContent(cb);
        event.consume();
    }

    @FXML
    public void dragDetected0301( MouseEvent event ) {
        Dragboard db = card0101.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(new Image("/GUI/CardImage31.jpg"));
        db.setContent(cb);
        event.consume();
    }
    /**
     * Drag Methods End
     */




    /**
     * These method is designed for Drop the image into the board
     * Drop Methods Start
     *
     * @param event event
     */
    @FXML
    public void dragOver0101( DragEvent event ) {
        int location[] = { 1 , 1 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0101( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0101.setImage(image);
    }

    @FXML
    public void dragOver0201( DragEvent event ) {
        int location[] = { 2 , 1 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0201( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0201.setImage(image);
    }

    @FXML
    public void dragOver0301( DragEvent event ) {
        int location[] = { 3 , 1 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0301( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0301.setImage(image);
    }

    @FXML
    public void dragOver0401( DragEvent event ) {
        int location[] = { 4 , 1 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0401( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0401.setImage(image);
    }

    @FXML
    public void dragOver0501( DragEvent event ) {
        int location[] = { 5 , 1 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0501( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0501.setImage(image);
    }

    @FXML
    public void dragOver0601( DragEvent event ) {
        int location[] = { 6 , 1 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0601( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0601.setImage(image);
    }

    @FXML
    public void dragOver0701( DragEvent event ) {
        int location[] = { 7 , 1 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0701( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0701.setImage(image);
    }

    @FXML
    public void dragOver0801( DragEvent event ) {
        int location[] = { 8 , 1 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0801( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0801.setImage(image);
    }

    @FXML
    public void dragOver0901( DragEvent event ) {
        int location[] = { 9 , 1 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0901( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0901.setImage(image);
    }

    @FXML
    public void dragOver1001( DragEvent event ) {
        int location[] = { 10 , 1 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop1001( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image1001.setImage(image);
    }

    @FXML
    public void dragOver0102( DragEvent event ) {
        int location[] = { 1 , 2 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0102( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0102.setImage(image);
    }

    @FXML
    public void dragOver0202( DragEvent event ) {
        int location[] = { 2 , 2 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0202( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0202.setImage(image);
    }

    @FXML
    public void dragOver0302( DragEvent event ) {
        int location[] = { 3 , 2 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0302( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0302.setImage(image);
    }

    @FXML
    public void dragOver0402( DragEvent event ) {
        int location[] = { 4 , 2 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0402( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0402.setImage(image);
    }

    @FXML
    public void dragOver0502( DragEvent event ) {
        int location[] = { 5 , 2 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0502( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0502.setImage(image);
    }

    @FXML
    public void dragOver0602( DragEvent event ) {
        int location[] = { 6 , 2 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0602( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0602.setImage(image);
    }

    @FXML
    public void dragOver0702( DragEvent event ) {
        int location[] = { 7 , 2 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0702( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0702.setImage(image);
    }

    @FXML
    public void dragOver0802( DragEvent event ) {
        int location[] = { 8 , 2 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0802( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0802.setImage(image);
    }

    @FXML
    public void dragOver0902( DragEvent event ) {
        int location[] = { 9 , 2 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0902( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0902.setImage(image);
    }

    @FXML
    public void dragOver1002( DragEvent event ) {
        int location[] = { 10 , 2 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop1002( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image1002.setImage(image);
    }

    @FXML
    public void dragOver0103( DragEvent event ) {
        int location[] = { 1 , 3 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0103( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0103.setImage(image);
    }

    @FXML
    public void dragOver0203( DragEvent event ) {
        int location[] = { 2 , 3 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0203( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0203.setImage(image);
    }

    @FXML
    public void dragOver0303( DragEvent event ) {
        int location[] = { 3 , 3 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0303( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0303.setImage(image);
    }

    @FXML
    public void dragOver0403( DragEvent event ) {
        int location[] = { 4 , 3 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0403( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0403.setImage(image);
    }

    @FXML
    public void dragOver0503( DragEvent event ) {
        int location[] = { 5 , 3 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0503( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0503.setImage(image);
    }

    @FXML
    public void dragOver0603( DragEvent event ) {
        int location[] = { 6 , 3 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0603( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0603.setImage(image);
    }

    @FXML
    public void dragOver0703( DragEvent event ) {
        int location[] = { 7 , 3 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0703( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0703.setImage(image);
    }

    @FXML
    public void dragOver0803( DragEvent event ) {
        int location[] = { 8 , 3 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0803( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0803.setImage(image);
    }

    @FXML
    public void dragOver0903( DragEvent event ) {
        int location[] = { 9 , 3 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0903( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0903.setImage(image);
    }

    @FXML
    public void dragOver1003( DragEvent event ) {
        int location[] = { 10 , 3 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop1003( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image1003.setImage(image);
    }

    @FXML
    public void dragOver0104( DragEvent event ) {
        int location[] = { 1 , 4 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0104( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0104.setImage(image);
    }

    @FXML
    public void dragOver0204( DragEvent event ) {
        int location[] = { 2 , 4 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0204( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0204.setImage(image);
    }

    @FXML
    public void dragOver0304( DragEvent event ) {
        int location[] = { 3 , 4 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0304( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0304.setImage(image);
    }

    @FXML
    public void dragOver0404( DragEvent event ) {
        int location[] = { 4 , 4 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0404( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0404.setImage(image);
    }

    @FXML
    public void dragOver0504( DragEvent event ) {
        int location[] = { 5 , 4 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0504( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0504.setImage(image);
    }

    @FXML
    public void dragOver0604( DragEvent event ) {
        int location[] = { 6 , 4 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0604( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0604.setImage(image);
    }

    @FXML
    public void dragOver0704( DragEvent event ) {
        int location[] = { 7 , 4 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0704( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0704.setImage(image);
    }

    @FXML
    public void dragOver0804( DragEvent event ) {
        int location[] = { 8 , 4 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0804( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0804.setImage(image);
    }

    @FXML
    public void dragOver0904( DragEvent event ) {
        int location[] = { 9 , 4 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0904( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0904.setImage(image);
    }

    @FXML
    public void dragOver1004( DragEvent event ) {
        int location[] = { 10 , 4 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop1004( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image1004.setImage(image);
    }

    @FXML
    public void dragOver0105( DragEvent event ) {
        int location[] = { 1 , 5 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0105( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0105.setImage(image);
    }

    @FXML
    public void dragOver0205( DragEvent event ) {
        int location[] = { 2 , 5 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0205( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0205.setImage(image);
    }

    @FXML
    public void dragOver0305( DragEvent event ) {
        int location[] = { 3 , 5 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0305( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0305.setImage(image);
    }

    @FXML
    public void dragOver0405( DragEvent event ) {
        int location[] = { 4 , 5 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0405( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0405.setImage(image);
    }

    @FXML
    public void dragOver0505( DragEvent event ) {
        int location[] = { 5 , 5 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0505( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0505.setImage(image);
    }

    @FXML
    public void dragOver0605( DragEvent event ) {
        int location[] = { 6 , 5 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0605( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0605.setImage(image);
    }

    @FXML
    public void dragOver0705( DragEvent event ) {
        int location[] = { 7 , 5 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0705( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0705.setImage(image);
    }

    @FXML
    public void dragOver0805( DragEvent event ) {
        int location[] = { 8 , 5 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0805( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0805.setImage(image);
    }

    @FXML
    public void dragOver0905( DragEvent event ) {
        int location[] = { 9 , 5 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0905( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0905.setImage(image);
    }

    @FXML
    public void dragOver1005( DragEvent event ) {
        int location[] = { 10 , 5 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop1005( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image1005.setImage(image);
    }

    @FXML
    public void dragOver0106( DragEvent event ) {
        int location[] = { 1 , 6 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0106( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0106.setImage(image);
    }

    @FXML
    public void dragOver0206( DragEvent event ) {
        int location[] = { 2 , 6 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0206( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0206.setImage(image);
    }

    @FXML
    public void dragOver0306( DragEvent event ) {
        int location[] = { 3 , 6 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0306( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0306.setImage(image);
    }

    @FXML
    public void dragOver0406( DragEvent event ) {
        int location[] = { 4 , 6 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0406( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0406.setImage(image);
    }

    @FXML
    public void dragOver0506( DragEvent event ) {
        int location[] = { 5 , 6 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0506( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0506.setImage(image);
    }

    @FXML
    public void dragOver0606( DragEvent event ) {
        int location[] = { 6 , 6 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0606( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0606.setImage(image);
    }

    @FXML
    public void dragOver0706( DragEvent event ) {
        int location[] = { 7 , 6 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0706( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0706.setImage(image);
    }

    @FXML
    public void dragOver0806( DragEvent event ) {
        int location[] = { 8 , 6 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0806( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0806.setImage(image);
    }

    @FXML
    public void dragOver0906( DragEvent event ) {
        int location[] = { 9 , 6 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0906( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0906.setImage(image);
    }

    @FXML
    public void dragOver1006( DragEvent event ) {
        int location[] = { 10 , 6 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop1006( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image1006.setImage(image);
    }

    @FXML
    public void dragOver0107( DragEvent event ) {
        int location[] = { 1 , 7 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0107( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0107.setImage(image);
    }

    @FXML
    public void dragOver0207( DragEvent event ) {
        int location[] = { 2 , 7 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0207( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0207.setImage(image);
    }

    @FXML
    public void dragOver0307( DragEvent event ) {
        int location[] = { 3 , 7 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0307( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0307.setImage(image);
    }

    @FXML
    public void dragOver0407( DragEvent event ) {
        int location[] = { 4 , 7 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0407( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0407.setImage(image);
    }

    @FXML
    public void dragOver0507( DragEvent event ) {
        int location[] = { 5 , 7 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0507( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0507.setImage(image);
    }

    @FXML
    public void dragOver0607( DragEvent event ) {
        int location[] = { 6 , 7 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0607( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0607.setImage(image);
    }

    @FXML
    public void dragOver0707( DragEvent event ) {
        int location[] = { 7 , 7 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0707( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0707.setImage(image);
    }

    @FXML
    public void dragOver0807( DragEvent event ) {
        int location[] = { 8 , 7 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0807( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0807.setImage(image);
    }

    @FXML
    public void dragOver0907( DragEvent event ) {
        int location[] = { 9 , 7 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0907( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0907.setImage(image);
    }

    @FXML
    public void dragOver1007( DragEvent event ) {
        int location[] = { 10 , 7 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop1007( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image1007.setImage(image);
    }

    @FXML
    public void dragOver0108( DragEvent event ) {
        int location[] = { 1 , 8 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0108( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0108.setImage(image);
    }

    @FXML
    public void dragOver0208( DragEvent event ) {
        int location[] = { 2 , 8 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0208( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0208.setImage(image);
    }

    @FXML
    public void dragOver0308( DragEvent event ) {
        int location[] = { 3 , 8 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0308( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0308.setImage(image);
    }

    @FXML
    public void dragOver0408( DragEvent event ) {
        int location[] = { 4 , 8 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0408( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0408.setImage(image);
    }

    @FXML
    public void dragOver0508( DragEvent event ) {
        int location[] = { 5 , 8 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0508( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0508.setImage(image);
    }

    @FXML
    public void dragOver0608( DragEvent event ) {
        int location[] = { 6 , 8 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0608( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0608.setImage(image);
    }

    @FXML
    public void dragOver0708( DragEvent event ) {
        int location[] = { 7 , 8 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0708( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0708.setImage(image);
    }

    @FXML
    public void dragOver0808( DragEvent event ) {
        int location[] = { 8 , 8 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0808( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0808.setImage(image);
    }

    @FXML
    public void dragOver0908( DragEvent event ) {
        int location[] = { 9 , 8 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0908( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0908.setImage(image);
    }

    @FXML
    public void dragOver1008( DragEvent event ) {
        int location[] = { 10 , 8 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop1008( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image1008.setImage(image);
    }

    @FXML
    public void dragOver0109( DragEvent event ) {
        int location[] = { 1 , 9 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0109( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0109.setImage(image);
    }

    @FXML
    public void dragOver0209( DragEvent event ) {
        int location[] = { 2 , 9 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0209( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0209.setImage(image);
    }

    @FXML
    public void dragOver0309( DragEvent event ) {
        int location[] = { 3 , 9 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0309( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0309.setImage(image);
    }

    @FXML
    public void dragOver0409( DragEvent event ) {
        int location[] = { 4 , 9 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0409( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0409.setImage(image);
    }

    @FXML
    public void dragOver0509( DragEvent event ) {
        int location[] = { 5 , 9 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0509( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0509.setImage(image);
    }

    @FXML
    public void dragOver0609( DragEvent event ) {
        int location[] = { 6 , 9 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0609( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0609.setImage(image);
    }

    @FXML
    public void dragOver0709( DragEvent event ) {
        int location[] = { 7 , 9 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0709( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0709.setImage(image);
    }

    @FXML
    public void dragOver0809( DragEvent event ) {
        int location[] = { 8 , 9 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0809( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0809.setImage(image);
    }

    @FXML
    public void dragOver0909( DragEvent event ) {
        int location[] = { 9 , 9 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0909( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0909.setImage(image);
    }

    @FXML
    public void dragOver1009( DragEvent event ) {
        int location[] = { 10 , 9 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop1009( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image1009.setImage(image);
    }

    @FXML
    public void dragOver0110( DragEvent event ) {
        int location[] = { 1 , 10 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0110( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0110.setImage(image);
    }

    @FXML
    public void dragOver0210( DragEvent event ) {
        int location[] = { 2 , 10 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0210( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0210.setImage(image);
    }

    @FXML
    public void dragOver0310( DragEvent event ) {
        int location[] = { 3 , 10 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0310( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0310.setImage(image);
    }

    @FXML
    public void dragOver0410( DragEvent event ) {
        int location[] = { 4 , 10 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0410( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0410.setImage(image);
    }

    @FXML
    public void dragOver0510( DragEvent event ) {
        int location[] = { 5 , 10 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0510( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0510.setImage(image);
    }

    @FXML
    public void dragOver0610( DragEvent event ) {
        int location[] = { 6 , 10 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0610( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0610.setImage(image);
    }

    @FXML
    public void dragOver0710( DragEvent event ) {
        int location[] = { 7 , 10 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0710( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0710.setImage(image);
    }

    @FXML
    public void dragOver0810( DragEvent event ) {
        int location[] = { 8 , 10 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0810( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0810.setImage(image);
    }

    @FXML
    public void dragOver0910( DragEvent event ) {
        int location[] = { 9 , 10 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop0910( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image0910.setImage(image);
    }

    @FXML
    public void dragOver1010( DragEvent event ) {
        int location[] = { 10 , 10 };
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    public void dragDrop1010( DragEvent event ) {
        Image image = event.getDragboard().getImage();
        image1010.setImage(image);
    }

    /**
     * Drop Methods End
     *
     */


//    public String getIntroduction(){
//        String
//    }
}
