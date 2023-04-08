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

        int sum = 0;
        sumSalarys(sum);
        int maxSalary = 0;
        int minSalary = 0;
        minMuxSalary(maxSalary, minSalary);
        averageSalary(sum);

        System.out.println("Ф.И.О. " + employee1.getFIO());
        System.out.println("Ф.И.О. " + employee2.getFIO());
        System.out.println("Ф.И.О. " + employee3.getFIO());
        System.out.println("Ф.И.О. " + employee4.getFIO());
        System.out.println("Ф.И.О. " + employee5.getFIO());


    }
    public static void sumSalarys(int sum) {
        int[] arr = new int[5];
        arr [0] = 25500;
        arr [1] = 31450;
        arr [2] = 40200;
        arr [3] = 34900;
        arr [4] = 54200;
        sum = 0;
        for (int index = 0; index < arr.length; index++){
            sum = sum + arr[index];
        }

        System.out.println( "Сумма затрат на зарплаты в месяц " + sum);

    }


    public static void minMuxSalary( int maxSalary, int minSalary) {
        int[] arr = new int[5];
        arr [0] = 25500;
        arr [1] = 31450;
        arr [2] = 40200;
        arr [3] = 34900;
        arr [4] = 54200;
        maxSalary = arr[0];
        minSalary = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (val > maxSalary) {
                maxSalary = val;
            }
            if (val < minSalary) {
                minSalary = val;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + maxSalary);
        System.out.println("Сотрудник с максимальной зарплатой " + minSalary);
    }

    public static void averageSalary(int sum) {
        int[] arr = new int[5];
        arr [0] = 25500;
        arr [1] = 31450;
        arr [2] = 40200;
        arr [3] = 34900;
        arr [4] = 54200;
        sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        sum = sum / arr.length;
        System.out.println( "Среднее значение зарплат " + sum);

    }

}