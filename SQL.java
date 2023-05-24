import java.sql.*;

public class SQL {
    
    private Connection con;
    
    public SQL() throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        this.con = DriverManager.getConnection(
            System.getenv("connect_url"), 
            System.getenv("passcode"), 
            System.getenv("key")
        );
    }

    public String[] loadSaves() {
        String[] saves = {"a"};
        return saves;
    }

    public boolean getSaves() {
        return true;
    }
}

/*
 * 
 * Statement st = con.createStatement();
 
        // Execute the query
        int count = st.executeUpdate(query);
        System.out.println(
            "number of rows affected by this query= "
            + count);
 */
