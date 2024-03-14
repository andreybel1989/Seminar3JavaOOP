/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 * «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»
 */
public class Freelancer extends Employee {

    private double midleNumDayOfMounth;
    private int numHoursOfDay;

    public Freelancer(String surName, String name, double salary, int age, double midleNumDayOfMounth,
            int numHoursOfDay) {
        super(surName, name, salary, age);
        this.midleNumDayOfMounth = midleNumDayOfMounth;
        this.numHoursOfDay = numHoursOfDay;
    }

    @Override
    public double calculateSalary() {

        return midleNumDayOfMounth * numHoursOfDay * salary;

    }

    public static Freelancer create(String surName, String name, double salary, int age,
            double midleNumDayOfMounth, int numHoursOfDay) {
        return new Freelancer(surName, name, salary, age, midleNumDayOfMounth, numHoursOfDay);
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s; ставка: %.2f руб.; заработная плата: %.2f руб.; возраст: %d; дней в месяце: %.2f; количество отработанных часов в день: %d.",
                surName, name, salary, calculateSalary(), age, midleNumDayOfMounth, numHoursOfDay);
    }

    

    public double getMidleNumDayOfMounth() {
        return midleNumDayOfMounth;
    }

    public void setMidleNumDayOfMounth(double midleNumDayOfMounth) {
        this.midleNumDayOfMounth = midleNumDayOfMounth;
    }

    public int getNumHoursOfDay() {
        return numHoursOfDay;
    }

    public void setNumHoursOfDay(int numHoursOfDay) {
        this.numHoursOfDay = numHoursOfDay;
    }

}
