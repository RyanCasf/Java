public class SalaryControl {
    Monthly mon = new Monthly();
    Freelance free = new Freelance();
    
    public void viewMonthly(float baseSalary, float discounts) {
        mon.setBaseSalary(baseSalary);
        mon.setDiscounts(discounts);
        mon.CalculateSalary();
    }
    
    public void viewFreelance(float hours, float hourValue) {
        free.setHourValue(hourValue);
        free.setHours(hours);
        free.CalculateSalary();
    }
}