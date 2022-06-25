package truyenQQ.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "chapter")
public class chapterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String concept;

	@Column
	private String chapterName;
	
	
	@Column
	private Date createDate;
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	
	public String getChapterName() {
		return chapterName;
	}

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}
	

	public String getConcept() {
		return concept;
	}

	public void setConcept(String concept) {
		this.concept = concept;
	}

	public storyEntity getStoryChapters() {
		return storyChapters;
	}

	public void setStoryChapters(storyEntity storyChapters) {
		this.storyChapters = storyChapters;
	}

	public int getId() {
		return id;
	}
	public List<commentEntity> getCommentOfChapter() {
		return commentOfChapter;
	}

	public void setCommentOfChapter(List<commentEntity> commentOfChapter) {
		this.commentOfChapter = commentOfChapter;
	}
	
	
	
	public List<contentOfChapterEntity> getContents() {
		return contents;
	}

	public void setContents(List<contentOfChapterEntity> contents) {
		this.contents = contents;
	}
	
	@OneToMany(mappedBy = "chaptersComment")
	private List<commentEntity> commentOfChapter = new ArrayList<>();
	

	@OneToMany(mappedBy = "contents")
	private List<contentOfChapterEntity> contents = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "story_id")
	private storyEntity storyChapters;
	
}
