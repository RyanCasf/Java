public class Monthly extends Employee{
    private float baseSalary, discounts;
    
    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public float getDiscounts() {
        return discounts;
    }

    public void setDiscounts(float discounts) {
        this.discounts = discounts;
    }
    
    public String CalculateSalary(){
        this.setTotalSalary(this.getBaseSalary() * this.getDiscounts());
        String msg = "DADOS\n\nSalário final: R$ "+this.getTotalSalary();
        return msg;
    }
}