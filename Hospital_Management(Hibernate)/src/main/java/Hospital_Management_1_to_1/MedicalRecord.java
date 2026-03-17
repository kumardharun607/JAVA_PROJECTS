package Hospital_Management_1_to_1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class MedicalRecord {
	
	@Id
	
	private int record_id;

	private String blood_group;

	private String allergies;

	@OneToOne
	private patient patients;

	public int getRecord_id() {
		return record_id;
	}

	

	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}



	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public patient getPatients() {
		return patients;
	}

	public void setPatients(patient patients) {
		this.patients = patients;
	}



	@Override
	public String toString() {
		return "MedicalRecord [record_id=" + record_id + ", blood_group=" + blood_group + ", allergies=" + allergies
				+ "]";
	}
	
	

}
