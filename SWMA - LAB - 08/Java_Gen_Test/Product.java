import java.math.BigDecimal;
import java.sql.Timestamp;

public class Product {
	private Integer _id;
	private Integer _siteId;
	private Integer _categoryId;
	private String _name;
	private String _description;
	private BigDecimal _price;
	private String _imageGallery;
	private Integer _inventoryCount;
	private Boolean _isAvailable;
	private Timestamp _createdAt;

	public Product() {
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

	public void setCategoryId(Integer aCategoryId) {
		this._categoryId = aCategoryId;
	}

	public Integer getCategoryId() {
		return this._categoryId;
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

	public void setPrice(BigDecimal aPrice) {
		this._price = aPrice;
	}

	public BigDecimal getPrice() {
		return this._price;
	}

	public void setImageGallery(String aImageGallery) {
		this._imageGallery = aImageGallery;
	}

	public String getImageGallery() {
		return this._imageGallery;
	}

	public void setInventoryCount(Integer aInventoryCount) {
		this._inventoryCount = aInventoryCount;
	}

	public Integer getInventoryCount() {
		return this._inventoryCount;
	}

	public void setIsAvailable(Boolean aIsAvailable) {
		this._isAvailable = aIsAvailable;
	}

	public Boolean getIsAvailable() {
		return this._isAvailable;
	}

	public void setCreatedAt(Timestamp aCreatedAt) {
		this._createdAt = aCreatedAt;
	}

	public Timestamp getCreatedAt() {
		return this._createdAt;
	}
}