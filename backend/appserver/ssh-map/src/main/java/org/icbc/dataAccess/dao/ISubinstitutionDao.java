package org.icbc.dataAccess.dao;

import java.util.List;

import org.icbc.dataAccess.dto.SubinstitutionDto;


public interface ISubinstitutionDao {
	//����idֵ��ѯ������Ϣ
	SubinstitutionDto getById(Long id);
	//ɾ��������Ϣ
	void delete(SubinstitutionDto subinstitution);
	//���������Ϣ
	void save(SubinstitutionDto subinstitution);
	//���»�����Ϣ
	void update(SubinstitutionDto subinstitution);
	//��������»�����Ϣ
	void saveOrUpdate(SubinstitutionDto subinstitution);
	//���ҿɸ����Ļ���
	List<SubinstitutionDto> selectWorkSubinstitution(int offset, int limit);  
}
