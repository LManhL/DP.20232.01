package views.screen.intro;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import utils.Utils;
import views.screen.BaseScreenHandler;
import views.screen.popup.PopupScreen;

/**
 * OCP: Khi muốn thay đổi cách hiển thị thông báo lỗi và nội dung của thông báo lỗi sẽ phải sửa code
 * do hiện đang xử lý hiển thị thông báo lỗi trên màn hình Popup và nội dung thông báo là cố định nếu
 * xảy ra lỗi IOException
 */
public class IntroScreenHandler extends BaseScreenHandler {

    private static final Logger LOGGER = Utils.getLogger(IntroScreenHandler.class.getName());


    @FXML
    ImageView logo;

    public IntroScreenHandler(Stage stage, String screenPath) throws IOException {
        super(stage, screenPath);

        try {
            setupData(null);
            setupFunctionality();
        } catch (IOException ex) {
            LOGGER.info(ex.getMessage());
            PopupScreen.error("Error when loading resources.");
        } catch (Exception ex) {
            LOGGER.info(ex.getMessage());
            PopupScreen.error(ex.getMessage());
        }
    }


    protected void setupData(Object dto) throws Exception {
        return;
    }

    protected void setupFunctionality() throws Exception {
        File file = new File("src/main/resources/assets/images/Logo.png");
        Image image = new Image(file.toURI().toString());
        logo.setImage(image);
    }
}