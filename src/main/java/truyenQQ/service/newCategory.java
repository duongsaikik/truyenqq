package truyenQQ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import truyenQQ.convert.catogoryConvert;
import truyenQQ.entity.storyCategoryEntity;
import truyenQQ.modem.catogoryDTO;
import truyenQQ.repository.categoryRepository;
import truyenQQ.service.impl.INewCategory;

@Service
public class newCategory implements INewCategory{

	@Autowired
	private categoryRepository categoryRepository;
	
	@Autowired
	private catogoryConvert catogoryConvert;

	@Override
	public catogoryDTO save(catogoryDTO category) {
		storyCategoryEntity entity = catogoryConvert.toEntity(category);
		entity = categoryRepository.save(entity);
		return catogoryConvert.toDTO(entity);
	}
	
	
	
}
