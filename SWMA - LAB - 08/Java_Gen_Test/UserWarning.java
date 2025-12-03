import java.sql.Timestamp;

public class UserWarning {
	private Integer _id;
	private Integer _userId;
	private Integer _siteId;
	private String _reasonNote;
	private String _severity;
	private Boolean _isResolved;
	private Timestamp _createdAt;

	public UserWarning() {
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

	public void setReasonNote(String aReasonNote) {
		this._reasonNote = aReasonNote;
	}

	public String getReasonNote() {
		return this._reasonNote;
	}

	public void setSeverity(String aSeverity) {
		this._severity = aSeverity;
	}

	public String getSeverity() {
		return this._severity;
	}

	public void setIsResolved(Boolean aIsResolved) {
		this._isResolved = aIsResolved;
	}

	public Boolean getIsResolved() {
		return this._isResolved;
	}

	public void setCreatedAt(Timestamp aCreatedAt) {
		this._createdAt = aCreatedAt;
	}

	public Timestamp getCreatedAt() {
		return this._createdAt;
	}
}