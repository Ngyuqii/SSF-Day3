package SSF.HttpSession.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Item {

    @NotNull(message="This field is mandatory.")
    @Size(min=2, message="Item name must be more than 1 character.")
    private String name;

    @NotNull(message="This field is mandatory.")
    @Min(value=1, message="Minimum quantity is 1.")
    private Integer quantity;

    //Getters
    public String getName() {
        return name;
    }
    public Integer getQuantity() {
        return quantity;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
