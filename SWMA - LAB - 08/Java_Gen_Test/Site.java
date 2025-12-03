import java.sql.Timestamp;

public class Site {
	private Integer _id;
	private Integer _userId;
	private String _sitePath;
	private String _title;
	private String _status;
	private String _description;
	private Timestamp _createdAt;

	public Site() {
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

	public void setSitePath(String aSitePath) {
		this._sitePath = aSitePath;
	}

	public String getSitePath() {
		return this._sitePath;
	}

	public void setTitle(String aTitle) {
		this._title = aTitle;
	}

	public String getTitle() {
		return this._title;
	}

	public void setStatus(String aStatus) {
		this._status = aStatus;
	}

	public String getStatus() {
		return this._status;
	}

	public void setDescription(String aDescription) {
		this._description = aDescription;
	}

	public String getDescription() {
		return this._description;
	}

	public void setCreatedAt(Timestamp aCreatedAt) {
		this._createdAt = aCreatedAt;
	}

	public Timestamp getCreatedAt() {
		return this._createdAt;
	}
}