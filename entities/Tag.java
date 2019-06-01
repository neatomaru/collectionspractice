package entities;

public class Tag {
    private String name;
    private String description;

    public Tag(String tagName, String description) {
        this.name = tagName;
        this.description = description;
    }

    public String getTagName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setTagName(String tagName) {
        this.name = tagName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && this.getClass() == obj.getClass()) {
            Tag tag = (Tag) obj;

            if(this.name.equals(tag.name) && this.description.equals(tag.description)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime + ((name == null) || (description == null) ? 0 : name.hashCode() + description.hashCode());

    }

    @Override
    public String toString() {
        return name;
    }
}
