package day15.StudentManagementJDBC.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Student;

public class StudentDAO {

    public void addStudent(Student student) throws Exception {

        Connection con = DBConnection.getConnection();

        String sql =
                "INSERT INTO student VALUES (?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, student.getRollNo());
        ps.setString(2, student.getName());
        ps.setString(3, student.getDepartment());

        ps.executeUpdate();

        ps.close();
        con.close();
    }


    public ArrayList<Student> getAllStudents() throws Exception {

        ArrayList<Student> students =
                new ArrayList<Student>();

        Connection con = DBConnection.getConnection();

        String sql = "SELECT * FROM student";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            Student student = new Student(
                    rs.getInt("roll_no"),
                    rs.getString("name"),
                    rs.getString("department")
            );

            students.add(student);
        }

        rs.close();
        ps.close();
        con.close();

        return students;
    }


    public Student searchStudent(int rollNo) throws Exception {

        Connection con = DBConnection.getConnection();

        String sql =
                "SELECT * FROM student WHERE roll_no = ?";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setInt(1, rollNo);

        ResultSet rs = ps.executeQuery();

        Student student = null;

        if (rs.next()) {

            student = new Student(
                    rs.getInt("roll_no"),
                    rs.getString("name"),
                    rs.getString("department")
            );
        }

        rs.close();
        ps.close();
        con.close();

        return student;
    }


    public void updateStudent(Student student) throws Exception {

        Connection con = DBConnection.getConnection();

        String sql =
                "UPDATE student SET name = ?, department = ? WHERE roll_no = ?";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setString(1, student.getName());
        ps.setString(2, student.getDepartment());
        ps.setInt(3, student.getRollNo());

        ps.executeUpdate();

        ps.close();
        con.close();
    }


    public void deleteStudent(int rollNo) throws Exception {

        Connection con = DBConnection.getConnection();

        String sql =
                "DELETE FROM student WHERE roll_no = ?";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setInt(1, rollNo);

        ps.executeUpdate();

        ps.close();
        con.close();
    }
}
