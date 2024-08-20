package JavaConceptsTransientAndVolatile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientExample implements Serializable {
	private String username;
	private transient String password; // This field won't be serialized

	public TransientExample(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Username: " + username + ", Password: " + password;
	}

	public static void main(String[] args) {

		TransientExample user = new TransientExample("JohnDoe", "mySecretPassword");

		// Serialize the object
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
			oos.writeObject(user);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialize the object
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {
			TransientExample deserializedUser = (TransientExample) ois.readObject();
			System.out.println(deserializedUser); // The password will be null
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
