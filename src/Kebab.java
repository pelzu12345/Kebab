public class Kebab {
    private float price;
    private String name;
    private String description;
    public static String kebabName="Najlepszy kebab w miescie";

    public Kebab() {
    }


    public Kebab(float price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public static String getKebabName() {
        return kebabName;
    }

    public static void setKebabName(String kebabName) {
        Kebab.kebabName = kebabName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Kebab{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", kebabName='" + kebabName + '\'' +

                '}';
    }
}