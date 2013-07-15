import org.voltdb.*;
import org.voltdb.client.*;

public class UpdateUser extends VoltProcedure {
	public final SQLStmt stmt = new SQLStmt("UPDATE usertable SET field0=?, field1=?, field2=?, field3=?, field4=?, field5=?, field6=?, field7=?, field8=?, field9=? where key=?");

	public VoltTable[] run(String key, String field0, String field1, String field2, String field3, String field4, String field5, String field6, String field7, String field8, String field9) {
		voltQueueSQL(stmt, field0, field1, field2, field3, field4, field5, field6, field7, field8, field9, key);
		return voltExecuteSQL();
	}
}
