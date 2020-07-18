package org.icbc.dataAccess.dao;

import org.icbc.dataAccess.dto.EpidemicDto;
//��������Ϣ��CRUD����
public interface IEpidemicDao {
	//����idֵ��ѯ������Ϣ
	EpidemicDto getById(Long id);
	//ɾ��������Ϣ
	void delete(EpidemicDto epid);
	//����������Ϣ
	void save(EpidemicDto epid);
	//����������Ϣ
	void update(EpidemicDto epid);
	//���������������Ϣ
	void saveOrUpdate(EpidemicDto epid);
}
