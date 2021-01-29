package model;

import java.util.Arrays;
import java.util.Objects;

public class Garden {
    private Plant[] plants;
    private int index;

    public Garden(int n) {
        plants = new Plant[n];
    }


    /**
     * Добавить в поле класса переменную int index которая будет отвечать за номер ячейки в массиве объектов,
     * куда будет класться следующий элемент, оно же будет отвечать и за реальное количество сохраненных объектов в массиве
     * 1.	add - аргумент объект типа Plant, который добавляет цветок в массив растений
     * , возвращает true или false - получилось ли добавить цветок в массив или нет.
     * (без цикла, записывать элемент по индексу index, далее index увеличить. Сделать проверки на доступность добавления)
     */
    public boolean add(Plant plant) {
        if (index < plants.length) {
            plants[index] = plant;
            index++;
            return true;
        }
        return false;
    }


    /**
     * get на вход принимает индекс растения,
     * возвращает растение из массива растений по его индексу или null если индекс некорректный. (без цикла)
     */
    public Plant get(int index) {
        if (index >= 0 && index < this.index) {
            return plants[index];
        }
        return null;
    }

    /**
     * count -
     * возвращает реальное количество растений в саду (столько сколько добавлено в массив, а не его размер).
     */
    public int count() {
        return index;
    }

    public Plant search(String name) {
        for (int i = 0; i < index; i++) {
            if (plants[i].getName().equals(name)) {
                return plants[i];
            }
        }
        return null;
    }

    public int search(Plant plant) {
        for (int i = 0; i < index; i++) {
            if (plant == plants[i]) {
                return i;
            }
        }
        return -1;
    }

    // 1 2 3 4 5 6
    public Plant delete(String name) {
        int index = search(search(name));
        if (index == -1) {
            return null;
        }
        Plant plant = plants[index];
        for (int i = index; i < this.index - 1; i++) {
            plants[i] = plants[i + 1];
        }
        this.index--;
        return plant;
    }

    public boolean delete(Plant plant) {
        int index = search(plant);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < this.index - 1; i++) {
            plants[i] = plants[i + 1];
        }
        this.index--;
        return true;
    }

    // 1 2 4 5 6 * *
    public boolean insert(Plant plant, int index) {
        if (this.index == this.plants.length) {
            return false;
        }
        for (int i = this.index; i > index; i--) {
            this.plants[i] = this.plants[i - 1];
        }
        this.plants[index] = plant;
        this.index++;
        return true;

    }

    @Override
    public String toString() {
        String plantName = "";
        for (int i = 0; i < index; i++) {
            plantName += " " + (i + 1) + "." + plants[i] + "\n";
        }
        return plantName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garden garden = (Garden) o;
        if (this.index != garden.index) return false;
        for (int i = 0; i < this.index; i++) {
            if (!this.plants[i].equals(garden.plants[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(index);
        result = 31 * result + Arrays.hashCode(plants);
        return result;
    }
}

