public class Employer {
    String name;
    int salary;
    int workHours;
    int hireYear;


    Employer(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax = 0.0;
    int tempSalary = salary;
    int workTime = 2023-hireYear;
    int bonuss;
    double raising = 0.0;
    double totalSalary = 0.0;

    void tax() {
        if (this.salary >= 1000) {
            tax  = (this.salary*0.03);
        }
        tempSalary -= tax;
    }
    void bonus () {
        if (this.workHours > 40) {
            bonuss = (workHours-40)*30;
            tempSalary += bonuss;
        }
    }
    void raiseSalary() {

        if (workTime<10) {
            raising = sal * 0.05;
        } else if (workTime <20 && workTime>9) {
            raising = salary *0.10;
        } else if (workTime>19){
            raising = salary*0.15;
        }
        totalSalary = this.salary + raising;
    }


    void workerInfo() {
        System.out.println("Çalışanın adı: " + this.name + "\nÇalışma saati: " + this.workHours + "\nMaaşı: " + this.salary + "\nBaşlangıç yılı: " + hireYear + "\nVergi: "
                + tax + "\nBonus: " + bonuss + "\nMaaş artışı: " + raising + "\nVergiler ve Bonuslarla Maaş: " + tempSalary+ "\nToplam Maaş: " + totalSalary);
    }

    public static void main(String[] args) {
        Employer employer = new Employer("Baran", 3000, 52, 1999);
        employer.tax();
        employer.bonus();
        employer.raiseSalary();

        employer.workerInfo();


    }
}