package subsystem.interbank;

import common.exception.UnrecognizedException;
import utils.ApplicationProgrammingInterface;

/**
 * Mức cohesion: Functional cohesion
 * Do các phương thức trong class này hoạt động cùng một mục đích chức năng chính là
 * tương tác với InterbankBoundary
 * @Nguyen Van Manh
 */

public class InterbankBoundary {

	String query(String url, String data) {
		String response = null;
		try {
			response = ApplicationProgrammingInterface.post(url, data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new UnrecognizedException();
		}
		return response;
	}

}
