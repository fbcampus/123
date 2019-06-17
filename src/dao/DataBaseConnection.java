package dao;

import java.sql.*;

//ʵ�����ݿ���������
public class DataBaseConnection {
	//�������ݿ������� 
    private final String DBDRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriverriver";
    //�������ݿ�����URL  
    private final String DBURL = "jdbc:sqlserver://localhost:1433;Database=courseSystem";
    //�������ݿ������û���
    private final String DBUSER = "sa" ;  
    //�������ݿ���������  
    private final String DBPASSWORD = "sa" ;  
    //�������ݿ����Ӷ���  
    private Connection conn = null ;
    //���췽������������ 
    public DataBaseConnection(){  
        try{ 
        	//��������
            Class.forName(DBDRIVER) ; 
            //���������ݿ������
            this.conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD) ;    
        }  
        catch (Exception e){ 
        	//����������ʧ��,�����쳣����
            System.out.println("��������ʧ��," + e);  
        }  
    }  
    // ȡ�����ݿ�����  
    public Connection getConnection(){  
        return conn ;  
    }  
    // �ر����ݿ�����  
    public void close(){  
        try{  
        	//�����ӹر�
            conn.close() ;  
        }catch (Exception e){
        	//�����ӹر�ʧ��,�����쳣����
            System.out.println("���ݿ����ӹر�ʧ��," + e);  
        }         
    }  
}  
