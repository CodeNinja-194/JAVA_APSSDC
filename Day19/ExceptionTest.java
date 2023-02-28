class ExceptionTest {

	public static void main(String args[]) {
		int empId = 10;
		try {
			String userName = getUserNameById(empId);
			System.out.println(userName);
		} catch (UserNotFoundException ue) {
			ue.printStackTrace();
		} catch (MultipleUserFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String getUserNameById(int empId)
			throws MultipleUserFoundException, UserNotFoundException {
		User[] user = userDao.getUserById(empId);
		if (user == null) {
			throw new UserNotFoundException("User not present in Database");
		}
		if (user.length > 1) {
			throw new MultipleUserFoundException(
					"Multiple User present in Database with same empId");
		}
		return user[0].getName();
	}
}