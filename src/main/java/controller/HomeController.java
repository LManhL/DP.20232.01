package controller;

import java.sql.SQLException;
import java.util.List;

import dao.media.MediaDAO;

/**
 * This class controls the flow of events in homescreen
 * @author nguyenlm
 */

/**
 * LSP: class kế thừa từ BaseController nhưng không tuân theo hành vi được mong đợi từ lớp cha.
 */

/**
 * DIP: class này phụ thuộc trực tiếp vào class MediaDAO qua vệc gọi trực tiếp phương thức getAllMedia của lớp UserDAO
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
