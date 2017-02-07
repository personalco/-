
public class Doctor {

	private Patient patient;
	private DoctorModel doctorModel;

	public Doctor(DoctorModel doctorModel) {
		this.doctorModel = doctorModel;
	}

	public void requestTreatment(Patient patient) {
		this.patient = patient;

		inquery();
		treatment();
		prescription();

	}

	private void inquery() {
		System.out.println(patient.talkMyName() + "��, ������ ��ȸ�ϰڽ��ϴϴ�.");
		System.out.println(doctorModel.getComputer() + "���� ȯ���� �̸��� ��ȸ�մϴ�.");
	}

	private void treatment() {
		System.out.println(patient.talkTroubleType() + "..�׷��ñ���..");
		System.out.println("�ǻ簡" + doctorModel.getMedicalAppliance() + " �� ȯ�ڸ� �����մϴ�");
	}

	private void prescription() {
		
		if ( patient.talkMyAge() >=20 ) {
			System.out.println(patient.talkMyAge() + "�� �̽ñ���. ���Ѿ��� �帱�Կ�.");
				}
		else {
			System.out.println(patient.talkMyAge() + "�� �̽ñ���. ���� ���� �帱�Կ�.");
		}
		
		System.out.println("�ǻ簡" +  doctorModel.getComputer() + " ȯ���� ó������ �ۼ��մϴ�.");
	}

}
