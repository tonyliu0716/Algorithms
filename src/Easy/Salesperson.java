package Easy;

/**
 * Created by tonyliu on 4/27/17.
 */
//6.a
public class Salesperson {

    private Integer id;
    private Double salesAmount;

    public Salesperson(int id, double salesAmount) {
        this.id = id;
        this.salesAmount = salesAmount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(Double salesAmount) {
        this.salesAmount = salesAmount;
    }
}
