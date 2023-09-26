public enum Topping {
    CHOCOLATE_SPRINKLES,
    WHIPPED_CREAM,
    RAINBOW_SPRINKLES,
    STRAWBERRY_SYRUP,
    CHOCOLATE_SYRUP;

    public double getPrice() {
        return switch (this) {
            case RAINBOW_SPRINKLES -> 1.5;
            case STRAWBERRY_SYRUP -> 1.0;
            default -> 0.0;
        };
    }
}
