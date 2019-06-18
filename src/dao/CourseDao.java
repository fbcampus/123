package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import manager.Course;

public class CourseDao {
	//���ݿγ̱�Ž������ݲ�ѯ
	public List<Course> queryById(String courseId){
		//������ܲ�ѯ�������ݵ�����
		List<Course> idSet = new ArrayList<Course>();
		//����SQL��ѯ���
		String sql = "SELECT * FROM course WHERE courseId LIKE ?";
		PreparedStatement pstmt = null;  
        DataBaseConnection dbc = null;
        //������������ݿ�ľ������
        try {
        	// �������ݿ�  
            dbc = new DataBaseConnection();  
            pstmt = dbc.getConnection().prepareStatement(sql);
            pstmt.setString(1,"%" + courseId + "%");
            // �������ݿ��ѯ����  
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
            	//��ѯ�����ݣ�֮�󽫲�ѯ�������ݸ�ֵ��user���� 
            	Course course = new Course();
            	course.setCourseId(rs.getString(1));
            	course.setCourseName(rs.getString(2));
            	course.setCourseScore(rs.getString(3));
            	course.setCourseTheory(rs.getString(4));
            	course.setCourseTest(rs.getString(5));
            	course.setCourseTime(rs.getString(6));
            	course.setCourseKind(rs.getString(7));
            	course.setCourseNature(rs.getString(8));
            	course.setCourseExam(rs.getString(9));
            	course.setCourseCollege(rs.getString(10));
            	//����ѯ���������ݼ��뵽List����֮��  
            	idSet.add(course);  
            }
            rs.close();  
            pstmt.close();
        }catch(Exception e) {
        	System.out.println("���������쳣!" + e);
        }finally {
        	//�ر����ݿ�����  
            dbc.close(); 
		}
		return idSet;
	}	
	
	//���ݿγ����ƽ������ݲ�ѯ
	public List<Course> queryByName(String courseName){
		//������ܲ�ѯ�������ݵ�����
		List<Course> nameSet = new ArrayList<Course>();
		//����SQL��ѯ���
		String sql = "SELECT * FROM course WHERE courseName LIKE ?";
		PreparedStatement pstmt = null;  
        DataBaseConnection dbc = null;
        //������������ݿ�ľ������
        try {
        	// �������ݿ�  
            dbc = new DataBaseConnection();  
            pstmt = dbc.getConnection().prepareStatement(sql);
            pstmt.setString(1,"%" + courseName + "%");
            // �������ݿ��ѯ����  
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
            	//��ѯ�����ݣ�֮�󽫲�ѯ�������ݸ�ֵ��user���� 
            	Course course = new Course();
            	course.setCourseId(rs.getString(1));
            	course.setCourseName(rs.getString(2));
            	course.setCourseScore(rs.getString(3));
            	course.setCourseTheory(rs.getString(4));
            	course.setCourseTest(rs.getString(5));
            	course.setCourseTime(rs.getString(6));
            	course.setCourseKind(rs.getString(7));
            	course.setCourseNature(rs.getString(8));
            	course.setCourseExam(rs.getString(9));
            	course.setCourseCollege(rs.getString(10));
            	//����ѯ���������ݼ��뵽List����֮��  
            	nameSet.add(course);  
            }
            rs.close();  
            pstmt.close();
        }catch(Exception e) {
        	System.out.println("���������쳣!" + e);
        }finally {
        	//�ر����ݿ�����  
            dbc.close(); 
		}
		return nameSet;
	}
	
	//���ݿγ̿���ʱ�������������
	public List<Course> sortByTime(){
		//������ܲ�ѯ�������ݵ�����
		List<Course> timeSet = new ArrayList<Course>();
		//����SQL��ѯ��䲢����courseTime�н�����������
		String sql = "SELECT * FROM course ORDER BY courseTime";
		PreparedStatement pstmt = null;  
        DataBaseConnection dbc = null;
        //������������ݿ�ľ������
        try {
        	// �������ݿ�  
            dbc = new DataBaseConnection();  
            pstmt = dbc.getConnection().prepareStatement(sql);
            // �������ݿ��ѯ����  
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
            	//��ѯ�����ݣ�֮�󽫲�ѯ�������ݸ�ֵ��user���� 
            	Course course = new Course();
            	course.setCourseId(rs.getString(1));
            	course.setCourseName(rs.getString(2));
            	course.setCourseScore(rs.getString(3));
            	course.setCourseTheory(rs.getString(4));
            	course.setCourseTest(rs.getString(5));
            	course.setCourseTime(rs.getString(6));
            	course.setCourseKind(rs.getString(7));
            	course.setCourseNature(rs.getString(8));
            	course.setCourseExam(rs.getString(9));
            	course.setCourseCollege(rs.getString(10));
            	//����ѯ���������ݼ��뵽List����֮��  
            	timeSet.add(course);  
	           }
	           rs.close();  
	           pstmt.close();
	       }catch(Exception e) {
	       	System.out.println("���������쳣!" + e);
	       }finally {
	       	//�ر����ݿ�����  
            dbc.close(); 
           }
		return timeSet;
	}
	
	//���ݿγ̿���ʱ�������������
	public List<Course> sortByScore(){
		//������ܲ�ѯ�������ݵ�����
		List<Course> scoreSet = new ArrayList<Course>();
		//����SQL��ѯ��䲢����courseTime�н�����������
		String sql = "SELECT * FROM course ORDER BY courseScore";
		PreparedStatement pstmt = null;  
        DataBaseConnection dbc = null;
        //������������ݿ�ľ������
        try {
        	// �������ݿ�  
            dbc = new DataBaseConnection();  
            pstmt = dbc.getConnection().prepareStatement(sql);
            // �������ݿ��ѯ����  
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
            	//��ѯ�����ݣ�֮�󽫲�ѯ�������ݸ�ֵ��user���� 
            	Course course = new Course();
            	course.setCourseId(rs.getString(1));
            	course.setCourseName(rs.getString(2));
            	course.setCourseScore(rs.getString(3));
            	course.setCourseTheory(rs.getString(4));
            	course.setCourseTest(rs.getString(5));
            	course.setCourseTime(rs.getString(6));
            	course.setCourseKind(rs.getString(7));
            	course.setCourseNature(rs.getString(8));
            	course.setCourseExam(rs.getString(9));
            	course.setCourseCollege(rs.getString(10));
            	//����ѯ���������ݼ��뵽List����֮��  
            	scoreSet.add(course);  
	           }
	           rs.close();  
	           pstmt.close();
	       }catch(Exception e) {
	       	System.out.println("���������쳣!" + e);
	       }finally {
	       	//�ر����ݿ�����  
            dbc.close(); 
           }
		return scoreSet;
	}
	
	//���ݿγ̿���ʱ�������������
	public List<Course> sortByExam(){
		//������ܲ�ѯ�������ݵ�����
		List<Course> examSet = new ArrayList<Course>();
		//����SQL��ѯ��䲢����courseTime�н�����������
		String sql = "SELECT * FROM course ORDER BY courseExam";
		PreparedStatement pstmt = null;  
	    DataBaseConnection dbc = null;
	    //������������ݿ�ľ������
	    try {
	    	// �������ݿ�  
	    	dbc = new DataBaseConnection();  
	        pstmt = dbc.getConnection().prepareStatement(sql);
	        // �������ݿ��ѯ����  
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
	       	//��ѯ�����ݣ�֮�󽫲�ѯ�������ݸ�ֵ��user���� 
         	Course course = new Course();
          	course.setCourseId(rs.getString(1));
            course.setCourseName(rs.getString(2));
	        course.setCourseScore(rs.getString(3));
	        course.setCourseTheory(rs.getString(4));
	        course.setCourseTest(rs.getString(5));
	        course.setCourseTime(rs.getString(6));
	        course.setCourseKind(rs.getString(7));
	        course.setCourseNature(rs.getString(8));
	        course.setCourseExam(rs.getString(9));
	        course.setCourseCollege(rs.getString(10));
	        //����ѯ���������ݼ��뵽List����֮��  
	        examSet.add(course);  
		    }
		    rs.close();  
		    pstmt.close();
		}catch(Exception e) {
		    System.out.println("���������쳣!" + e);
		}finally {
		    //�ر����ݿ�����  
	        dbc.close(); 
	    }
			return examSet;
	}
/*------------------------------------------------------------------------------------*/
	
}
