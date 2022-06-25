package truyenQQ.convert;

import org.springframework.stereotype.Component;

import truyenQQ.entity.storyCategoryEntity;
import truyenQQ.modem.catogoryDTO;

@Component
public class catogoryConvert {

	public storyCategoryEntity toEntity(catogoryDTO catogory) {
		storyCategoryEntity entity = new storyCategoryEntity();
		entity.setNameCategory(catogory.getNameCategory());
		return entity;
	}
	public catogoryDTO toDTO(storyCategoryEntity catogory) {
		catogoryDTO dto = new catogoryDTO();
		dto.setId(catogory.getId());
		dto.setNameCategory(catogory.getNameCategory());
		dto.setModifiedDate(catogory.getModifiedDate());
		dto.setCreateDate(catogory.getCreateDate());
		dto.setCreateBy(catogory.getCreateBy());
		dto.setModifiedBy(catogory.getModifiedBy());
		return dto;
	}
}
