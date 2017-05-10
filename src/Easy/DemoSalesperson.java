package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tonyliu on 4/27/17.
 */
public class DemoSalesperson {

    private List<Salesperson> salesPersons;

    public DemoSalesperson() {
        salesPersons = new ArrayList<Salesperson>();

        for(int i = 0; i < 10; i++) {
            Salesperson person = new Salesperson(9999, 0);
            salesPersons.add(person);
        }

    }

    public List<Salesperson> getSalesPersons() {
        return salesPersons;
    }

    public void setSalesPersons(List<Salesperson> salesPersons) {
        this.salesPersons = salesPersons;
    }

    //dispaly:
    public static void main(String[] args) {
        DemoSalesperson person = new DemoSalesperson();
        List<Salesperson> list = person.getSalesPersons();
        for(int i = 0; i < list.size(); i++) {
            System.out.println("ID number: " + list.get(i).getId() + ", value: " + list.get(i).getSalesAmount());
            System.out.println("------------------");
        }
    }

}
