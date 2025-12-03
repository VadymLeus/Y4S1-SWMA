import java.sql.Timestamp;

public class Category {
	private Integer _id;
	private Integer _siteId;
	private String _name;
	private String _description;
	private Integer _sortOrder;
	private Timestamp _createdAt;

	public Category() {
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

	public void setSortOrder(Integer aSortOrder) {
		this._sortOrder = aSortOrder;
	}

	public Integer getSortOrder() {
		return this._sortOrder;
	}

	public void setCreatedAt(Timestamp aCreatedAt) {
		this._createdAt = aCreatedAt;
	}

	public Timestamp getCreatedAt() {
		return this._createdAt;
	}
}