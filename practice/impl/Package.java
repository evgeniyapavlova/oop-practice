package practice.impl;

public enum Package {
    PLASTIC("plastic"), GLASS("glass");

    private final String material;

    Package(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
