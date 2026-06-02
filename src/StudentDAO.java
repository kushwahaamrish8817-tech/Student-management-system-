import java.sql.Connection;
import java.sql.PreparedStatement;

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
}