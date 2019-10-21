package persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable {

	public void serializar(String dir, Object objeto) {

		try {
			FileOutputStream fos = new FileOutputStream(dir);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(objeto);
			oos.flush();
			oos.close();
			System.out.println("Guardado correctamente");
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

	}

	public Object desSerializar(String dir) {
		Object miObject = null;
		try {
			FileInputStream fis = new FileInputStream(dir);
			ObjectInputStream ois = new ObjectInputStream(fis);
			miObject = ois.readObject();
			ois.close();
			System.out.println("Cargado correctamente");
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

		return miObject;
	}

}
