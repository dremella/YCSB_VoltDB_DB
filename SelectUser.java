import org.voltdb.*;
import org.voltdb.client.*;

public class SelectUser extends VoltProcedure {
	public final SQLStmt stmt = new SQLStmt("SELECT * from usertable where key=?");

	public VoltTable[] run(String key) {
		voltQueueSQL(stmt, key);
		return voltExecuteSQL();
	}
}
