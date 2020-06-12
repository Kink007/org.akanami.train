package akanami.java.base.enums;

public enum Color {
    WHITE(1, "白色"),
    BLACK(0, "黑色");

    private Color(Integer aIndex, String aName) {
        this.index = aIndex;
        this.name = aName;
    }

    public static String getName(int index) {
        for (Color c : Color.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
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
