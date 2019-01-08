package DBloader;


import java.sql.*;

public class Manager1 {
    //main method with exception throw
    public static void main(String[] args) throws ClassNotFoundException {
        //try block
        try {

            //calling the h2 database driver org.h2.Driver
            Class.forName("org.h2.Driver");

            //declaring host ,username and password
            String host = "jdbc:h2:~/test";
            String uName = "sa";
            String uPass = "sa";

            //giving a connection to the h2 database driver driver
            Connection conn = DriverManager.getConnection(host, uName, uPass);
            Statement statement = conn.createStatement();
            //  statement.executeUpdate("INSERT INTO VERONIKA " + "VALUES (3, 'Yarik', 2)");

            // Statement statement2 = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from VERONIKA");
            while (resultSet.next()) {
                System.out.println("Id " + resultSet.getInt("ID")+"\n"+  " Name " + resultSet.getString("NAME") +"\n"+ " Age: " + resultSet.getInt("AGE")+"\n");
            }

            conn.close();
        }
        //catch block
        catch (SQLException err) {
            //printing an error message
            System.out.println(err.getMessage());
        }

    }
}

