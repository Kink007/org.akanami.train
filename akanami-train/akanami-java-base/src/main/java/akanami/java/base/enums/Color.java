package akanami.java.base.enums;

public enum Color {
    WHITE(1, "白色"),
    BLACK(0, "黑色");

    private Color(Integer aIndex, String aName) {
        this.index = aIndex;
        this.name = aName;
    }

    private Integer index;
    private String name;

    public Integer getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }
}
