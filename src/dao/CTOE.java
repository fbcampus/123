package dao;

public class CTOE {
		//�жϿγ̵����
		public String CTOEOfKind(String courseKind) {
			String courseKindName = null;
			if ("ͨʶ������".equals(courseKind)) {
			courseKindName = "A";
			}else if("ѧ�ƻ�����".equals(courseKind)) {
				courseKindName = "B";
			}else if("רҵ��".equals(courseKind)) {
				courseKindName = "C";
			}else if("��Ҫʵ������".equals(courseKind)) {
				courseKindName = "D";
			}else if("���´�ҵʵ��".equals(courseKind)) {
				courseKindName = "E";
			}else {
				courseKindName = null;
			}
			return courseKindName;
		}
		
		//�жϿγ̵�����
		public String CTOEOfNature(String courseNature) {
			String courseNatureName = null;
			if("��".equals(courseNature)) {
				courseNatureName = "A";
			}else if("���޿�".equals(courseNature)) {
				courseNatureName = "B";
			}else if("ѡ�޿�".equals(courseNature)) {
				courseNatureName = "C";
			}else {
				courseNatureName = null;
			}
			return courseNatureName;
		}
		
		//�жϿγ̵Ŀ��˷�ʽ
		public String CTOEOfExam(String courseExam) {
			String courseExamName = null;
			if("����".equals(courseExam)) {
				courseExamName = "A";
			}else if("����".equals(courseExam)) {
				courseExamName = "B";
			}else {
				courseExamName = null;
			}
			return courseExamName;
		}
		
		//�жϿγ̵ĳе���λ
		public String CTOEOfCollege(String courseCollege) {
			String courseCollegeName = null;
			if("����ѧԺ".equals(courseCollege)) {
				courseCollegeName = "A";
			}else if("���ѧԺ".equals(courseCollege)) {
				courseCollegeName = "B";
			}else if("�����ѧԺ".equals(courseCollege)) {
				courseCollegeName = "C";
			}else if("����뷨ѧԺ".equals(courseCollege)) {
				courseCollegeName = "D";
			}else if("���˼����ѧԺ".equals(courseCollege)) {
				courseCollegeName = "E";
			}else if("���ݿ�ѧ������ѧԺ".equals(courseCollege)) {
				courseCollegeName = "F";
			}else if("����ѧԺ".equals(courseCollege)) {
				courseCollegeName = "G";
			}else if("��ѧѧԺ".equals(courseCollege)) {
				courseCollegeName = "H";
			}else if("����ѧԺ".equals(courseCollege)) {
				courseCollegeName = "I";
			}else if("ѧ����ҵ��".equals(courseCollege)) {
				courseCollegeName = "J";
			}else {
				 courseCollegeName = null;
			}
			return courseCollegeName;
		}
}
