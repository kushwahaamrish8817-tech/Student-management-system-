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
public void deleteStudent(int id) {
    try {
        Connection con = DBConnection.getConnection();

        String query = "DELETE FROM students WHERE id = ?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);

        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("Student Deleted Successfully!");
        } else {
            System.out.println("Student Not Found!");
        }

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }


}
public void updateStudent(int id, String name, int age) {
    try {
        Connection con = DBConnection.getConnection();

        String query = "UPDATE students SET name = ?, age = ? WHERE id = ?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, name);
        ps.setInt(2, age);
        ps.setInt(3, id);

        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("Student Updated Successfully!");
        } else {
            System.out.println("Student Not Found!");
        }

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

} 