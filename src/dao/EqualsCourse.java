package dao;

public class EqualsCourse {
	//�жϿγ̵����
	public String equalsKind(String courseKind) {
		String courseKindName = null;
		switch (courseKind) {
		case "A":
			courseKindName = "ͨʶ������";
			break;
		case "B":
			courseKindName = "ѧ�ƻ�����";
			break;
		case "C":
			courseKindName = "רҵ��";
			break;
		case "D":
			courseKindName = "��Ҫʵ������";
			break;
		case "E":
			courseKindName = "���´�ҵʵ��";
			break;
		}
		return courseKindName;
	}
	
	//�жϿγ̵�����
	public String equalsNature(String courseNature) {
		String courseNatureName = null;
		switch (courseNature) {
		case "A":
			courseNatureName = "��";
			break;
		case "B":
			courseNatureName = "���޿�";
			break;
		case "C":
			courseNatureName = "ѡ�޿�";
			break;
		}
		return courseNatureName;
	}
	
	//�жϿγ̵Ŀ��˷�ʽ
	public String equalsExam(String courseExam) {
		String courseExamName = null;
		switch (courseExam) {
		case "A":
			courseExamName = "����";
			break;
		case "B":
			courseExamName = "����";
			break;
		}
		return courseExamName;
	}
	
	//�жϿγ̵ĳе���λ
	public String equalsCollege(String courseCollege) {
		String courseCollegeName = null;
		switch (courseCollege) {
		case "A":
			courseCollegeName = "����ѧԺ";
			break;
		case "B":
			courseCollegeName = "���ѧԺ";
			break;
		case "C":
			courseCollegeName = "�����ѧԺ";
			break;
		case "D":
			courseCollegeName = "����뷨ѧԺ";
			break;
		case "E":
			courseCollegeName = "���˼����ѧԺ";
			break;
		case "F":
			courseCollegeName = "���ݿ�ѧ������ѧԺ";
			break;
		case "G":
			courseCollegeName = "����ѧԺ";
			break;
		case "H":
			courseCollegeName = "��ѧѧԺ";
			break;
		case "I":
			courseCollegeName = "����ѧԺ";
			break;
		case "J":
			courseCollegeName = "ѧ����ҵ��";
			break;
		}
		return courseCollegeName;
	}
}
