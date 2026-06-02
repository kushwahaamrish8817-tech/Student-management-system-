import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO {

public void addStudent(Student student) {
    try {
        Connection con = DBConnection.getConnection();

        String query = "INSERT INTO students(id, name, age) VALUES(?,?,?)";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, student.getId());
        ps.setString(2, student.getName());
        ps.setInt(3, student.getAge());

        ps.executeUpdate();

        System.out.println("Student Added Successfully!");

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

public void getAllStudents() {
    try {
        Connection con = DBConnection.getConnection();

        String query = "SELECT * FROM students";

        PreparedStatement ps = con.prepareStatement(query);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(
                    "ID: " + rs.getInt("id") +
                    ", Name: " + rs.getString("name") +
                    ", Age: " + rs.getInt("age"));
        }

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

}