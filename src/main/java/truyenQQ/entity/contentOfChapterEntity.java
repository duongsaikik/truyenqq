package truyenQQ.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contentOfChapter")
public class contentOfChapterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "chapter_id")
	private chapterEntity contents;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public chapterEntity getContents() {
		return contents;
	}

	public void setContents(chapterEntity contents) {
		this.contents = contents;
	}

	public int getId() {
		return id;
	}
	
}
