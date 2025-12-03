import java.sql.Timestamp;

public class TicketReply {
	private Integer _id;
	private Integer _ticketId;
	private Integer _userId;
	private String _body;
	private Boolean _isInternal;
	private Timestamp _createdAt;

	public TicketReply() {
		throw new UnsupportedOperationException();
	}

	public void setId(Integer aId) {
		this._id = aId;
	}

	public Integer getId() {
		return this._id;
	}

	public void setTicketId(Integer aTicketId) {
		this._ticketId = aTicketId;
	}

	public Integer getTicketId() {
		return this._ticketId;
	}

	public void setUserId(Integer aUserId) {
		this._userId = aUserId;
	}

	public Integer getUserId() {
		return this._userId;
	}

	public void setBody(String aBody) {
		this._body = aBody;
	}

	public String getBody() {
		return this._body;
	}

	public void setIsInternal(Boolean aIsInternal) {
		this._isInternal = aIsInternal;
	}

	public Boolean getIsInternal() {
		return this._isInternal;
	}

	public void setCreatedAt(Timestamp aCreatedAt) {
		this._createdAt = aCreatedAt;
	}

	public Timestamp getCreatedAt() {
		return this._createdAt;
	}
}