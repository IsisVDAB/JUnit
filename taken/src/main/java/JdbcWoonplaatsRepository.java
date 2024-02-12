import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcWoonplaatsRepository extends AbstractRepository implements WoonplaatsRepository{


    @Override
    public List<String> findMetStreepjes() {
        var woonplaatsen = new ArrayList<String>();
        var sql = """
                select naam
                from woonplaatsen
                where naam like '%-%'
                """;
        try (var connection = super.getConnection();
             var statement = connection.prepareStatement(sql)) {
            connection.setTransactionIsolation(
                    Connection.TRANSACTION_READ_COMMITTED);
            connection.setAutoCommit(false);
            for (var result = statement.executeQuery(); result.next(); ) {
                woonplaatsen.add(result.getString("naam"));
            }
            connection.commit();
            return woonplaatsen;
        } catch(SQLException ex) {
            throw new RepositoryException(ex);
        }
    }
}
