package org.icbc.dataAccess.dao;

import org.icbc.dataAccess.dto.ConfirmInformationPostDto;

//��ȷ����Ϣ�����CRUD
public interface IConfirmInformationPostDao {
		//����idֵ��ѯȷ����Ϣ
		ConfirmInformationPostDto getById(Long id);
		//ɾ��ȷ����Ϣ
		void delete(ConfirmInformationPostDto confirm);
		//����ȷ����Ϣ
		void save(ConfirmInformationPostDto confirm);
		//����ȷ����Ϣ
		void update(ConfirmInformationPostDto confirm);
		//���������ȷ����Ϣ
		void saveOrUpdate(ConfirmInformationPostDto confirm);
}
