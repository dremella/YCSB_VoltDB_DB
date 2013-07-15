import org.voltdb.*;
import org.voltdb.client.*;

public class DeleteUser extends VoltProcedure {
	public final SQLStmt stmt = new SQLStmt("DELETE from usertable where key=?");

	public VoltTable[] run(String key) {
		voltQueueSQL(stmt, key);
		return voltExecuteSQL();
	}
}
