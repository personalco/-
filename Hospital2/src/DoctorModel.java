/**
 * �����ͺ��̽��� ������ ���ε� ��..
 * 
 * @author owner
 *
 */
public class DoctorModel {

	private String computer;
	private String medicalAppliance;
	
	public DoctorModel(String computer, String medicalAppliance) {
		this.computer = computer;
		this.medicalAppliance = medicalAppliance;
	}

	public String getComputer() {
		return computer;
	}

	public void setComputer(String computer) {
		this.computer = computer;
	}

	public String getMedicalAppliance() {
		return medicalAppliance;
	}

	public void setMedicalAppliance(String medicalAppliance) {
		this.medicalAppliance = medicalAppliance;
	}
}
