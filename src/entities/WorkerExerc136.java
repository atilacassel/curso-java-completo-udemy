package entities;

import entities.enums.WorkerLevelExerc136;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class WorkerExerc136 {

    private String name;
    private WorkerLevelExerc136 level;
    private Double baseSalary;

    private DepartmentExerc136 department;
    private List<HourContractExerc136> contracts = new ArrayList<>(); //List não entra no construtor, ela tem que já ser instanciada na declaração do atributo

    public WorkerExerc136() {
    }

    public WorkerExerc136(String name, WorkerLevelExerc136 level, Double baseSalary, DepartmentExerc136 department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevelExerc136 getLevel() {
        return level;
    }

    public void setLevel(WorkerLevelExerc136 level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public DepartmentExerc136 getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentExerc136 department) {
        this.department = department;
    }

    public List<HourContractExerc136> getContracts() {
        return contracts;
    }

    public void addContracts(HourContractExerc136 contract) {
        contracts.add(contract);
    }

    public void removeContracts(HourContractExerc136 contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContractExerc136 c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
