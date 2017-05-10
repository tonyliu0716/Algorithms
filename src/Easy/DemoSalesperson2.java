package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tonyliu on 4/27/17.
 */
public class DemoSalesperson2 {

    private List<Salesperson> salesPersons;

    public DemoSalesperson2() {
        salesPersons = new ArrayList<Salesperson>();
        int count = 111;
        int increase = 25000;
        for(int i = 0; i < 10; i++) {
            Salesperson person = new Salesperson(count + i, increase + i * 5000);
            salesPersons.add(person);
        }

    }

    public List<Salesperson> getSalesPersons() {
        return salesPersons;
    }

    public void setSalesPersons(List<Salesperson> salesPersons) {
        this.salesPersons = salesPersons;
    }

    public static void main(String[] args) {
        DemoSalesperson2 person = new DemoSalesperson2();
        List<Salesperson> list = person.getSalesPersons();
        for(int i = 0; i < list.size(); i++) {
            System.out.println("ID number: " + list.get(i).getId() + ", value: " + list.get(i).getSalesAmount());
            System.out.println("------------------");
        }
    }

}
