import java.sql.Timestamp;

public class SiteTag {
	private Integer _id;
	private Integer _siteId;
	private Integer _tagId;
	private Timestamp _createdAt;

	public SiteTag() {
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

	public void setTagId(Integer aTagId) {
		this._tagId = aTagId;
	}

	public Integer getTagId() {
		return this._tagId;
	}

	public void setCreatedAt(Timestamp aCreatedAt) {
		this._createdAt = aCreatedAt;
	}

	public Timestamp getCreatedAt() {
		return this._createdAt;
	}
}