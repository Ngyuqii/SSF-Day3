package SSF.HttpSession.models;

public class Item {

    @NotNull(message="Item name cannot be blank.")
    @Size(min=3, message="Item name must be more than 3 letters.")
    private String name;

    @Min(value=1, message="Minimum quantity is 1.")
    @Digits(integer=1, )
    
}
