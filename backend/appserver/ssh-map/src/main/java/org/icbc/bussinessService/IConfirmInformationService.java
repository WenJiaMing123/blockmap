package org.icbc.bussinessService;

import org.icbc.dataAccess.dto.ConfirmInformationPostDto;

public interface IConfirmInformationService {
	//����ȷ����Ϣ
	public void addNewConfirm(ConfirmInformationPostDto confirm);
	//ɾ��ȷ����Ϣ
	public void deleteConfirm(ConfirmInformationPostDto confirm);
	//����ȷ����Ϣ
	public void updateConfirm(ConfirmInformationPostDto confirm);
	//����idֵ��ѯȷ����Ϣ
	public ConfirmInformationPostDto getConfirm(long id);
}
