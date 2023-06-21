package sg.edu.np.mad.madpractical;

public class User {
    private String name;
    private String Description;
    public int id;
    public boolean followed;

    public int imageView;

    public User() {
    }

    public User(String name, String description, int id, boolean followed) {
        this.name = name;
        Description = description;
        this.id = id;
        this.followed = followed;
        this.imageView = imageView;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }
}
