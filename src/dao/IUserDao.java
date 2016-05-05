package dao;
/**
 * @author LiDongdong
 * */
import java.util.List;

import domain.User;

public interface IUserDao {
	/**
	 * @���ܣ���¼
	 * @param���û���������
	 * @return���û���¼�Ƿ�ɹ�����true������ɹ�����false������ʧ��
	 * */
    public User login(String name, String passwd);
    /**
     * @���ܣ�ע��
     * @param���û���������
     * @return��ע���Ƿ�ɹ�����true������ɹ�����false������ʧ��
     * */
    public Boolean register(String name, String passwd);
    /**
     * @����: �ϴ�
     * @param:�û�id������������������ͼƬ��ַ
     * @return���ϴ��Ƿ�ɹ�����true������ɹ�����false������ʧ��
     * */
    public Boolean upLoad( int uid, String rName,String content,String picUrl);
    /**
     * @���ܣ���ӹ�ע
     * @param���û�uid1������ע�û�uid2
     * @return����ӹ�ע�Ƿ�ɹ�����true������ɹ�����false������ʧ��
     * */
    public Boolean addConcern(int uid1, int uid2);
    /**
     * @���ܣ�ȡ����ע
     * @param:�û�uid1������ע�û�uid2
     * @return:ȡ����ע�Ƿ�ɹ�����true������ɹ�����false������ʧ�� 
     * */
    public Boolean cancelConcern(int uid1, int uid2);
    /**
     * @���ܣ���ѯδ��˲���
     * @param:��
     * @return:δ��˲����б�
     * */
    public List unCheckList();
    /**
     * @���ܣ��������
     * @param:��
     * @return:��˷��ؽ������true������ɹ�����false������ʧ��
     * */
    public Boolean check(int rid);
}
