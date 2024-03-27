package controller;

import java.sql.SQLException;
import java.util.List;

import dao.media.MediaDAO;
//ISP : do HomeController được kế thừa từ lớp BaseController nhưng không sử dụng đến phương thức checkMediaInCart (),getListCartMedia()
/**
 * This class controls the flow of events in homescreen
 * @author nguyenlm
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
