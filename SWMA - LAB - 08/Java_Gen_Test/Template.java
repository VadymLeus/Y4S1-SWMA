import java.sql.Timestamp;

public class Template {
	private Integer _id;
	private String _name;
	private String _description;
	private String _defaultBlockContent;
	private Boolean _isSystem;
	private Timestamp _createdAt;

	public Template() {
		throw new UnsupportedOperationException();
	}

	public void setId(Integer aId) {
		this._id = aId;
	}

	public Integer getId() {
		return this._id;
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public String getName() {
		return this._name;
	}

	public void setDescription(String aDescription) {
		this._description = aDescription;
	}

	public String getDescription() {
		return this._description;
	}

	public void setDefaultBlockContent(String aDefaultBlockContent) {
		this._defaultBlockContent = aDefaultBlockContent;
	}

	public String getDefaultBlockContent() {
		return this._defaultBlockContent;
	}

	public void setIsSystem(Boolean aIsSystem) {
		this._isSystem = aIsSystem;
	}

	public Boolean getIsSystem() {
		return this._isSystem;
	}

	public void setCreatedAt(Timestamp aCreatedAt) {
		this._createdAt = aCreatedAt;
	}

	public Timestamp getCreatedAt() {
		return this._createdAt;
	}
}