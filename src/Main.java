public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Петров Даниил Александрович", 1, 25500);
        System.out.println(employee1);
        Employee employee2 = new Employee("Иванова Татьяна Викторовна", 2, 31450);
        System.out.println(employee2);
        Employee employee3 = new Employee("Перемчук Наталья Денисовна", 3, 40200);
        System.out.println(employee3);
        Employee employee4 = new Employee("Мышкин Иван Николаевич", 4, 34900);
        System.out.println(employee4);
        Employee employee5 = new Employee("Поднебесная Виолетта Евгеньевна", 5, 54200);
        System.out.println(employee5);
        conclusion();
        System.out.println("Ф.И.О. " + employee1.getFIO());
        System.out.println("Ф.И.О. " + employee2.getFIO());
        System.out.println("Ф.И.О. " + employee3.getFIO());
        System.out.println("Ф.И.О. " + employee4.getFIO());
        System.out.println("Ф.И.О. " + employee5.getFIO());

    }

    private static Employee[] employees = new Employee[4];{
            employees[0] = new Employee("Fam1 Name1 SName1", 1, 25500),
            employees[1] = new Employee("Fam2 Name2 SName2", 2, 31450),
            employees[2] = new Employee("Fam3 Name3 SName3", 3, 40200),
            employees[3] = new Employee("Fam4 Name4 SName4", 4, 34900),
            employees[4] = new Employee("Fam5 Name5 SName5", 5, 52400),
};


    public static void sumSalarys() {
        Employee[] employees = new Employee[4];
        int sum = 0;
        for (Employee i : employees) sum += i;
        System.out.println("Сумма затрат на зарплаты в месяц " + sum);
    }


    public static void minMuxSalary() {
        Employee[] employees = new Employee[4];
        var maxSalary = employees[0];
        Employee minSalary = employees[0];
        for (Employee val : employees) {
            if (val > maxSalary) {
                maxSalary = val;
            }
            if (minSalary > val) {
                minSalary = val;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + maxSalary);
        System.out.println("Сотрудник с максимальной зарплатой " + minSalary);
    }

    public static void averageSalary() {
        Employee[] employees = new Employee[4];
        int sum = 0;
        for (Employee i : employees) sum = sum + i;
        sum = sum / employees.length;
        System.out.println("Среднее значение зарплат " + sum);
    }

    public static void conclusion() {
        sumSalarys();
        minMuxSalary();
        averageSalary();
    }

}
