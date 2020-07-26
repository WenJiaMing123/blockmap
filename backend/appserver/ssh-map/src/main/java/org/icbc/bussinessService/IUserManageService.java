package org.icbc.bussinessService;

import org.icbc.dataAccess.dto.UserDto;

public interface IUserManageService {
		//�������û�
		public void addNewUser(UserDto user);
		//ɾ�������û�
		public void deleteUser(UserDto user);
		//���������û�
		public void updateUser(UserDto user);
		//����idֵ��ѯ�û�
		public UserDto getUser(long id);  
}
