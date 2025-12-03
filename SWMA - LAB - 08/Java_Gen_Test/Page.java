import java.sql.Timestamp;

public class Page {
	private Integer _id;
	private Integer _siteId;
	private String _slug;
	private String _blockContent;
	private Boolean _isHomepage;
	private String _seoTitle;
	private String _seoDescription;
	private Timestamp _createdAt;

	public Page() {
		throw new UnsupportedOperationException();
	}

	public void setId(Integer aId) {
		this._id = aId;
	}

	public Integer getId() {
		return this._id;
	}

	public void setSiteId(Integer aSiteId) {
		this._siteId = aSiteId;
	}

	public Integer getSiteId() {
		return this._siteId;
	}

	public void setSlug(String aSlug) {
		this._slug = aSlug;
	}

	public String getSlug() {
		return this._slug;
	}

	public void setBlockContent(String aBlockContent) {
		this._blockContent = aBlockContent;
	}

	public String getBlockContent() {
		return this._blockContent;
	}

	public void setIsHomepage(Boolean aIsHomepage) {
		this._isHomepage = aIsHomepage;
	}

	public Boolean getIsHomepage() {
		return this._isHomepage;
	}

	public void setSeoTitle(String aSeoTitle) {
		this._seoTitle = aSeoTitle;
	}

	public String getSeoTitle() {
		return this._seoTitle;
	}

	public void setSeoDescription(String aSeoDescription) {
		this._seoDescription = aSeoDescription;
	}

	public String getSeoDescription() {
		return this._seoDescription;
	}

	public void setCreatedAt(Timestamp aCreatedAt) {
		this._createdAt = aCreatedAt;
	}

	public Timestamp getCreatedAt() {
		return this._createdAt;
	}
}