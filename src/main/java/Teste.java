import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Teste {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        System.out.println(connection);
        PreparedStatement ps;
        String sql;

        sql = "insert into java_categoria(categoria) values(?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1,"cigarro");
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }
}
