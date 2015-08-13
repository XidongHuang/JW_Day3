package javaweb.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	public void deleteByFlowId(Integer flowId) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://testdb.c9xqmbjdijez.us-west-2.rds.amazonaws.com:3306/testDB";
			String user = "root";
			String password2 = "12345678";

			connection = DriverManager.getConnection(url, user, password2);

			String sql = "DELETE FROM examstudent WHERE flowId = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, flowId);

			preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public List<Students> getAll() {

		List<Students> students = new ArrayList<Students>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://testdb.c9xqmbjdijez.us-west-2.rds.amazonaws.com:3306/testDB";
			String user = "root";
			String password2 = "12345678";

			connection = DriverManager.getConnection(url, user, password2);

			String sql = "SELECT * FROM examstudent";
			preparedStatement = connection.prepareStatement(sql);
			rs = preparedStatement.executeQuery();

			while (rs.next()) {
				int flowId = rs.getInt(1);
				int type = rs.getInt(2);
				String idCard = rs.getString(3);
				String examCard = rs.getString(4);
				String studentName = rs.getString(5);
				String location = rs.getString(6);
				int grade = rs.getInt(7);

				Students student = new Students(flowId, type, idCard, examCard, studentName, location, grade);
				students.add(student);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return students;
	}
}
