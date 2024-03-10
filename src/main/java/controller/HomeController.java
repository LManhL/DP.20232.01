package controller;

import java.sql.SQLException;
import java.util.List;

import dao.media.MediaDAO;

/**
 * This class controls the flow of events in homescreen
 * @author nguyenlm
 */

/**
 * Mức cohesion: Functional cohesion
 * Do các phương thức trong class này hoạt động cùng một mục đích chức năng chính xử lý yêu cầu người dùng
 * gửi đến thông qua HomeScreenHandler
 * @Nguyen Van Manh
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
