
package poly.cafe.polycafe.entity;



/**
 *
 * @author Admin
 */
public class User {
    private String username;
    private String password;
    private boolean enabled;
    private String fullname;
    private String photo;
    private boolean manager;

    public static class Builder {
        private String username;
        private String password;
        private boolean enabled;
        private String fullname;
        private String photo = "photo.png";
        private boolean manager;

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder enabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder fullname(String fullname) {
            this.fullname = fullname;
            return this;
        }

        public Builder photo(String photo) {
            this.photo = photo;
            return this;
        }

        public Builder manager(boolean manager) {
            this.manager = manager;
            return this;
        }

        public User build() {
            return new User(username, password, enabled, fullname, photo, manager);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public User(String username, String password, boolean enabled, String fullname, String photo, boolean manager) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.fullname = fullname;
        this.photo = photo;
        this.manager = manager;
    }

    // Getter/setter nếu cần...
}

