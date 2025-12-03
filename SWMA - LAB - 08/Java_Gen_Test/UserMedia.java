import java.sql.Timestamp;

public class UserMedia {
	private Integer _id;
	private Integer _userId;
	private String _pathFull;
	private String _pathThumb;
	private String _originalFileName;
	private Integer _fileSize;
	private String _mimeType;
	private Timestamp _createdAt;

	public UserMedia() {
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

	public void setPathFull(String aPathFull) {
		this._pathFull = aPathFull;
	}

	public String getPathFull() {
		return this._pathFull;
	}

	public void setPathThumb(String aPathThumb) {
		this._pathThumb = aPathThumb;
	}

	public String getPathThumb() {
		return this._pathThumb;
	}

	public void setOriginalFileName(String aOriginalFileName) {
		this._originalFileName = aOriginalFileName;
	}

	public String getOriginalFileName() {
		return this._originalFileName;
	}

	public void setFileSize(Integer aFileSize) {
		this._fileSize = aFileSize;
	}

	public Integer getFileSize() {
		return this._fileSize;
	}

	public void setMimeType(String aMimeType) {
		this._mimeType = aMimeType;
	}

	public String getMimeType() {
		return this._mimeType;
	}

	public void setCreatedAt(Timestamp aCreatedAt) {
		this._createdAt = aCreatedAt;
	}

	public Timestamp getCreatedAt() {
		return this._createdAt;
	}
}