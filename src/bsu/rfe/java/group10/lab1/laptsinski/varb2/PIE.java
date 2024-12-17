package bsu.rfe.java.group10.lab1.laptsinski.varb2;

public class PIE extends Food implements Nutritious {
    // Поле для начинки
    private String filling;

    // Конструктор с параметром начинки
    public PIE(String filling) {
        super("Пирог");
        this.filling = filling;
    }

    // Метод употребления продукта
    @Override
    public void consume() {
        System.out.println(this + " съеден");
    }

    // Метод для получения начинки
    public String getFilling() {
        return filling;
    }

    // Метод для изменения начинки
    public void setFilling(String filling) {
        this.filling = filling;
    }

    // Переопределение equals() для сравнения по начинке
    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {  // Проверяем общее поле name
            if (!(obj instanceof PIE)) return false;  // Проверка типа
            return filling.equals(((PIE) obj).filling);  // Проверяем начинки
        } else {
            return false;
        }
    }

    // Переопределение toString() для вывода информации о пироге
    @Override
    public String toString() {
        return super.toString() + " с начинкой " + filling.toUpperCase() ;
    }

    @Override
    public double calculateCalories() {
        switch (filling.toLowerCase()) {
            case "вишневая":
                return 250.0;
            case "клубничная":
                return 200.0;
            case "яблочная":
                return 220.0;
            default:
                return 150.0;
        }
    }
}