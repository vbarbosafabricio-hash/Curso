import java.sql.*;

public class Login {
    public static void main(String[] args) {
        try {
            Connection coenxao = MySQLConnector.conectar();
            String strSqlPopularCbxId = "select * from `senac`. `tbl_senac` order by `id` asc;";
            Statement stmSqlPopularCbxId = coenxao.createStatement();
            ResultSet rsSqlPopularCbxId = stmSqlPopularCbxId.executeQuery(strSqlPopularCbxId);
            while (rsSqlPopularCbxId.next()) {
                System.out.println(rsSqlPopularCbxId.getString("nome"));
            }
            stmSqlPopularCbxId.close();
        } catch(Exception e) {
            System.err.println("Erro: "+ e);
        }
    }
}