public class Freelance extends Employee{
    private float hours, hourValue;

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public float getHourValue() {
        return hourValue;
    }

    public void setHourValue(float hourValue) {
        this.hourValue = hourValue;
    }
    
    public String CalculateSalary(){
        this.setTotalSalary(this.getHours() * this.getHourValue());
        String msg = "DADOS\n\nSalário final: R$ "+this.getTotalSalary();
        return msg;
    }
}