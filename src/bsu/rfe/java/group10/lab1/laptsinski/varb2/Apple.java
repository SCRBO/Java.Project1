package bsu.rfe.java.group10.lab1.laptsinski.varb2;
public class Apple extends Food implements Nutritious {
    // Новое внутреннее поле данных РАЗМЕР
    private String size;
    public Apple(String size) {
// Вызвать конструктор предка, передав ему имя класса
        super("Яблоко");
// Инициализировать размер яблока
        this.size = size;
    }
    // Переопределить способ употребления яблока
    public void consume() {
        System.out.println(this + " съедено");
    }
    // Селектор для доступа к полю данных РАЗМЕР
    public String getSize() {
        return size;
    }
    // Модификатор для изменения поля данных РАЗМЕР
    public void setSize(String size) {
        this.size = size;
    }
    // Переопределѐнная версия метода equals(), которая при сравнении
// учитывает не только поле name (Шаг 1), но и проверяет совместимость
// типов (Шаг 2) и совпадение размеров (Шаг 3)
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Apple)) return false; // Шаг 2
            return size.equals(((Apple)arg0).size); // Шаг 3
        } else
            return false;
    }

    @Override
    public double calculateCalories() {
        switch (size.toLowerCase()) {
            case "маленькая":
                return 70.0;
            case "средняя":
                return 100.0;
            case "большая":
                return 130.0;
            default:
                return 110.0;
        }
    }

    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}