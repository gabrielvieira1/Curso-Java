package sessao13.ExercicioDeFixacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private String name;
	private String email;
	private Date birthDate;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Client() {

	}

	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getDate() {
		return birthDate;
	}

	public String toString() {
		return "Client: " + name + " " + "(" + sdf.format(birthDate) + ")" + " - " + email;
	}

}
