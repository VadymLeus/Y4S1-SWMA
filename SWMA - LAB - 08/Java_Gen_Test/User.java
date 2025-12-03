import java.sql.Timestamp;

public class User {
	private Integer _id;
	private String _username;
	private String _email;
	private String _role;
	private String _avatarUrl;
	private Timestamp _createdAt;
	private Timestamp _updatedAt;

	public User() {
		throw new UnsupportedOperationException();
	}

	public void setId(Integer aId) {
		this._id = aId;
	}

	public Integer getId() {
		return this._id;
	}

	public void setUsername(String aUsername) {
		this._username = aUsername;
	}

	public String getUsername() {
		return this._username;
	}

	public void setEmail(String aEmail) {
		this._email = aEmail;
	}

	public String getEmail() {
		return this._email;
	}

	public void setRole(String aRole) {
		this._role = aRole;
	}

	public String getRole() {
		return this._role;
	}

	public void setAvatarUrl(String aAvatarUrl) {
		this._avatarUrl = aAvatarUrl;
	}

	public String getAvatarUrl() {
		return this._avatarUrl;
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