package truyenQQ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import truyenQQ.convert.storyConvert;
import truyenQQ.entity.storyEntity;
import truyenQQ.modem.storyDTO;
import truyenQQ.repository.storyRepository;
import truyenQQ.service.impl.INewStory;

@Service
public class NewStory implements INewStory{

	
	@Autowired
	private storyRepository storyRepositoty;
	
	@Autowired
	private storyConvert newConvert;
	
	
	@Override
	public storyDTO save(storyDTO story) {
		storyEntity entity = newConvert.toEntity(story);
		entity = storyRepositoty.save(entity);
		return newConvert.toDTO(entity);
	}

}
