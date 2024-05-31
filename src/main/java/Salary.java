import java.util.function.Predicate;

public class Salary {

    public boolean calculateTotalSalary(double salary) {

        int percentage = 8;
        // 8 i 7 deyis ki maaslar qaxlsin

        salary -= (salary * percentage) / 100;

        Predicate<Double> predicate = p-> p > 900;
        return predicate.test(salary);



    }

}
