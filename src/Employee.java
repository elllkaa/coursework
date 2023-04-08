public class Employee {
        private String FIO;
        private int Department;
        private float Salary;
        private static int Counter;
        private final int Id;

        public int getId() { return this.Id; }
        public String getFIO() { return this.FIO; }
        public int getDepartment() { return this.Department; }
        public float getSalary() { return this.Salary; }

        public void SetFIO(String fio) { this.FIO = fio; }
        public void SetDepartment(int dept) { this.Department = dept; }
        public void SetSalary(float sal) { this.Salary = sal; }

        public Employee(String fio, int dept, float salary) {
            FIO = fio;
            Department = dept;
            Salary = salary;
            Id = ++Counter;
        }

        @Override
        public String toString() {
            return "Id: " + Id + " Fio: " + FIO + " Dept: " + Department + " Salary: " + Salary;
        }
        public String toStringFio () {
            return "Ф.И.О" + FIO;
        }

        public static void main(String[] args) {
            Employee[] empl = new Employee[4];
            empl[0] = new Employee("Fam1 Name1 SName1", 1, 25500);
            empl[1] = new Employee("Fam2 Name2 SName2", 2, 31450);
            empl[2] = new Employee("Fam3 Name3 SName3", 3, 40200);
            empl[3] = new Employee("Fam4 Name4 SName4", 4, 34900);
            empl[4] = new Employee("Fam5 Name5 SName5", 5, 52400);

            for (Employee e: empl) {
                System.out.println(e);
            }
        }
}

