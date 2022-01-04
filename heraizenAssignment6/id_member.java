package HeraizenAssignmentNo6;

public class id_member {
	private static int count=5005;
	public static String suffix="IND";
	public static String prifix="ASHO";
	public static String getMemeberId( ){
	// It should increment the counter value and return the id like “ASHO5006IND”;
		return prifix+count+++suffix;
	}
}
