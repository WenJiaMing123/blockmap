package org.icbc.dataAccess.dao;

import org.icbc.dataAccess.dto.UserDto;
//��User���ݱ��CRUD
public interface IUserDao {
	//����idֵ��ѯ�û���Ϣ
	UserDto getById(Long id);
	//ɾ���û���Ϣ
	void delete(UserDto user);
	//�����û���Ϣ
	void save(UserDto user);
	//�����û���Ϣ
	void update(UserDto user);
	//����������û���Ϣ
	void saveOrUpdate(UserDto user);
}
