package br.com.denise.starbuzz;

public class Drink {

    private String name;
    private String description;
    private int imageResourceId;

    //Cada bebida tem um nome, descrição e recurso de imagem
    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    //drink é uma série de bebidas
    public static final Drink[] drinks = {
            new Drink("Latte",
                    "Café expresso com leite vaporizado",
                    R.drawable.latte),
            new Drink("Cappuccino",
                    "Café expresso, leite quente e espuma de leite vaporizado",
                    R.drawable.cappuccino),
            new Drink("Filter", "Grãos da mais alta qualidade, torrados e produzidos na hora",
                    R.drawable.filter)
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
