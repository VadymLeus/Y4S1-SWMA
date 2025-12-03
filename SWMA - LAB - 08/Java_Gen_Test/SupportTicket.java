import java.sql.Timestamp;

public class SupportTicket {
	private Integer _id;
	private Integer _userId;
	private String _subject;
	private String _body;
	private String _status;
	private String _priority;
	private Timestamp _createdAt;
	private Timestamp _updatedAt;

	public SupportTicket() {
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

	public void setSubject(String aSubject) {
		this._subject = aSubject;
	}

	public String getSubject() {
		return this._subject;
	}

	public void setBody(String aBody) {
		this._body = aBody;
	}

	public String getBody() {
		return this._body;
	}

	public void setStatus(String aStatus) {
		this._status = aStatus;
	}

	public String getStatus() {
		return this._status;
	}

	public void setPriority(String aPriority) {
		this._priority = aPriority;
	}

	public String getPriority() {
		return this._priority;
	}

	public void setCreatedAt(Timestamp aCreatedAt) {
		this._createdAt = aCreatedAt;
	}

	public Timestamp getCreatedAt() {
		return this._createdAt;
	}

	public void setUpdatedAt(Timestamp aUpdatedAt) {
		this._updatedAt = aUpdatedAt;
	}

	public Timestamp getUpdatedAt() {
		return this._updatedAt;
	}
}