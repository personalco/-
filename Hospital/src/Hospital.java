
public class Hospital {

	public static void main(String[] args) {
		/*
		 * Doctor ���� = new Doctor("����", "�����е�", "ü�°�" ); //new�ڸ� �����ڶ�� ��
		 * 
		 * ����.setComputer("MRI"); ����.inquery(); ����.treatment();
		 * 
		 * String computer = ����.getComputer(); String medicalAppliance =
		 * ����.getMedicalAppliance();
		 * 
		 * System.out.println("������ ��ǻ�ʹ�" + computer + " �Դϴ�.");
		 * System.out.println("������ ���ᵵ����" + medicalAppliance + " �Դϴ�.");
		 * 
		 * Doctor ������ = new Doctor(); ������.inquery(); ������.treatment();
		 */

		DoctorModel ��������� = new DoctorModel("�����е�1", "���ð�1");
		DoctorModel ����������� = new DoctorModel("�����е�2", "���ð�2");
		DoctorModel ����������� = new DoctorModel("�����е�3", "���ð�3");

		 Doctor ���� = new Doctor(���������);
		 ����.inquery();
		 ����.treatment();
		 ����.prescription();
		
		Doctor[] doctors = new Doctor[3];
		doctors[0] = new Doctor(���������);
		doctors[1] = new Doctor(�����������);
		doctors[2] = new Doctor(�����������);


		doctors[1].inquery();
		doctors[1].treatment();
		doctors[1].prescription();
		System.out.println("===================");
		for (int i = 0; i < doctors.length; i++) {
			doctors[i].inquery();
			doctors[i].treatment();
			doctors[i].prescription();
		}
		System.out.println("=====================");
		for (Doctor �ǻ� : doctors) {
			�ǻ�.inquery();
			�ǻ�.treatment();
			�ǻ�.prescription();
	}
}
}