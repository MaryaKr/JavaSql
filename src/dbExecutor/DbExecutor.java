package dbExecutor;

import java.sql.ResultSet;

public interface DbExecutor {
    void execute ();
    ResultSet executeQuery ();
}
