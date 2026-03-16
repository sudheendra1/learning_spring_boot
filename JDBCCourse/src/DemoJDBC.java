import  java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        /*
        import package
        load and register
        create statement
        execute statement
        process the results
        close
         */
        int sid =6;
        String sname = "Jasmine";
        int marks = 56;

        String url ="jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "3591";
        String query = "Select sname from student where sid=1";
        String read = "Select * from student";
        String create = "insert into student values (5,'john',48)";
        String createWithVariables = "insert into student values (" + sid + ", '" + sname + "' ," + marks + ")";
        String update = "update student set sname ='Max' where sid = 5";
        String delete = "delete from student where sid = 5";
        String preparedStatementQuery = "insert into student values(?,?,?)";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");

//        Statement st = con.createStatement();

        // READ

//        ResultSet rs = st.executeQuery(read);

//        System.out.println(rs.next());
//
//        String name = rs.getString("sname");
//
//        System.out.println(name);

//        while(rs.next()){
//            System.out.print(rs.getInt(1)+ " - ");
//            System.out.print(rs.getString(2)+ " - ");
//            System.out.println(rs.getInt(3));
//        }

        //CREATE
//        boolean status = st.execute(createWithVariables);
//        System.out.println(status);

        //UPDATE

//        st.execute(update);

        //DELETE

//        st.execute(delete);

//       //PREPAREDSTATEMENT
        PreparedStatement st = con.prepareStatement(preparedStatementQuery);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);
        st.execute();


        con.close();

        System.out.println("Connection Closed");


    }
}
