package org.icbc.bussinessService;

import java.util.List;

import org.icbc.dataAccess.dto.SubinstitutionDto;

public interface ISubinstitutionService {
		//���ӻ�����Ϣ
		public void addNewSubinstitution(SubinstitutionDto subinstitution);
		//ɾ��������Ϣ
		public void deleteSubinstitution(SubinstitutionDto subinstitution);
		//���»�����Ϣ
		public void updateSubinstitution(SubinstitutionDto subinstitution);
		//����idֵ��ѯ������Ϣ
		public SubinstitutionDto getSubinstitution(long id);
		//��ѯ�����������
		public List<SubinstitutionDto> selectWorkSubinstitution(int page, int limit);
}
