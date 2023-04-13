public class Employee {
        private String fIO;
        private int department;
        private float salary;
        private static int counter;
        private final int id;

        public int getId() { return this.id; }
        public String getFIO() { return this.fIO; }
        public int getDepartment() { return this.department; }
        public float getSalary() { return this.salary; }

        public void SetFIO(String fio) { this.fIO = fio; }
        public void SetDepartment(int dept) { this.department = dept; }
        public void SetSalary(float sal) { this.salary = sal; }

        public Employee(String fio, int dept, float salary) {
            fIO = fio;
            department = dept;
            salary = salary;
            id = ++counter;
        }

        @Override
        public String toString() {
            return "Id: " + id + " FIO " + fIO + " Dept: " + department + " Salary: " + salary;
        }
        public String toStringFio () {
            return "Ф.И.О" + fIO;
        }


}

