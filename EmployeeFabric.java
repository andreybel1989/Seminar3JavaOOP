import java.util.Random;

public class EmployeeFabric {

    public static Random random = new Random();

    public static Worker generateWorker() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов" };
        int age = random.nextInt(18, 60);
        int salary = random.nextInt(60000, 120001);

        return Worker.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary, age);
    }

    public static Freelancer generateFreelancer() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов" };
        int age = random.nextInt(18, 60);
        int salary = random.nextInt(500, 1000);
        double midleNumDayOfMounth = 20.8;
        int numHoursOfDay = random.nextInt(1, 8);

        return Freelancer.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary, age, midleNumDayOfMounth, numHoursOfDay);
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     * разных типов (Worker, Freelancer) в рамках домашней работы
     * 
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        int value;
        for (int i = 0; i < count; i++) {
            value = random.nextInt(2) ;
            if(value == 0){
                employees[i] = generateWorker();
            }else{
                employees[i] = generateFreelancer();
            }

            
        }
        return employees;
    }
}
