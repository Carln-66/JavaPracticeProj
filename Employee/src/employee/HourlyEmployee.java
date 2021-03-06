package employee;

/**
 * @Auther: Carl
 * @Date: 2021/02/03/10:05
 * @Description:
 */
public class HourlyEmployee extends Employee {
    private double wage;
    private double hour;

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    public String toString() {
        return "HourlyEmployee{" + super.toString() +
                '}';
    }
}
