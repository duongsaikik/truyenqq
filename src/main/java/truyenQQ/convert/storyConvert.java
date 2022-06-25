package truyenQQ.convert;

import org.springframework.stereotype.Component;

import truyenQQ.entity.storyEntity;
import truyenQQ.modem.storyDTO;

@Component
public class storyConvert {


	public storyEntity toEntity(storyDTO story) {
		storyEntity entity = new storyEntity();
		entity.setNameStory(story.getNameStory());
		entity.setStatus(story.getStatus());
		entity.setCategories(story.getTypes());
		entity.setViews(0);
		entity.setReview(story.getReview());
		return entity;
	}
	public storyDTO toDTO(storyEntity story) {
		storyDTO dto = new storyDTO();
		dto.setId(story.getId());
		dto.setNameStory(story.getNameStory());
		dto.setStatus(story.getStatus());
		dto.setReview(story.getReview());
		dto.setViews(story.getViews());
		dto.setTypes(story.getCategories());
		dto.setModifiedDate(story.getModifiedDate());
		dto.setCreateDate(story.getCreateDate());
		dto.setCreateBy(story.getCreateBy());
		dto.setModifiedBy(story.getModifiedBy());
		return dto;
	}
}
