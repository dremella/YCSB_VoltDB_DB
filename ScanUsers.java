import org.voltdb.*;
import org.voltdb.client.*;

public class ScanUsers extends VoltProcedure {
	public final SQLStmt stmt = new SQLStmt("SELECT * FROM usertable where key > ? LIMIT ?;");

	public VoltTable[] run(String key, int limit) {
		voltQueueSQL(stmt, key, limit);
		return voltExecuteSQL();
	}
}
