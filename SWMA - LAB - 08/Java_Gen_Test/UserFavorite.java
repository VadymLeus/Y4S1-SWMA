import java.sql.Timestamp;

public class UserFavorite {
	private Integer _id;
	private Integer _userId;
	private Integer _siteId;
	private Timestamp _createdAt;

	public UserFavorite() {
		throw new UnsupportedOperationException();
	}

	public void setId(Integer aId) {
		this._id = aId;
	}

	public Integer getId() {
		return this._id;
	}

	public void setUserId(Integer aUserId) {
		this._userId = aUserId;
	}

	public Integer getUserId() {
		return this._userId;
	}

	public void setSiteId(Integer aSiteId) {
		this._siteId = aSiteId;
	}

	public Integer getSiteId() {
		return this._siteId;
	}

	public void setCreatedAt(Timestamp aCreatedAt) {
		this._createdAt = aCreatedAt;
	}

	public Timestamp getCreatedAt() {
		return this._createdAt;
	}
}