public class CheckSalary {
    public static void main(String[] args) {

        Salary salary = new Salary();

        if (salary.calculateTotalSalary(1200)) {
            System.out.println("higher than 900, this is good");
        }else {
            System.out.println("less or equal than 900,  this is bad");
        }


    }
}