package at.project.stravinsky;

import java.util.Base64;

public class MainTest {

	public static void main(String[] args) {
		String name = "admin";
		String password = "admin";
		String authString = name + ":" + password;
		byte[] authEncBytes = Base64.getEncoder().encode(authString.getBytes());
		String authStringEnc = new String(authEncBytes);
		System.out.println(authStringEnc);
	}
}
