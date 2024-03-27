package controller;

import java.sql.SQLException;
import java.util.List;

import dao.media.MediaDAO;

/**
 * This class controls the flow of events in homescreen
 * @author nguyenlm
 */

/**
 * Vi phạm LSP: Vì lớp PaymentController không được sử dụng
 * các hàm kế thừa từ BaseController vì các hàm đó không liên quan gì
 * đến chức năng class này
 */
public class HomeController extends BaseController {


    /**
     * this method gets all Media in DB and return back to home to display
     * @return List[Media]
     * @throws SQLException
     */
    public static List getAllMedia() throws SQLException{
        return new MediaDAO().getAllMedia();
    }
}
