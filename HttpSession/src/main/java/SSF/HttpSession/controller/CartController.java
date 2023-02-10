package SSF.HttpSession.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import SSF.HttpSession.models.Cart;
import SSF.HttpSession.models.Item;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping(path="/cart")
public class CartController {
    
    @GetMapping
    public String getCart(Model model, HttpSession session){

        //Retrieve cart onject from session, or instantiate new cart if null
        Cart cart = (Cart)session.getAttribute("cart");
        if(null == cart){
            cart = new Cart();
            session.setAttribute("cart", cart); //add cart object to session
        }

        model.addAttribute("item", new Item());
        model.addAttribute("cart", cart);
        
        return "cart";

    }

    @PostMapping
    public String addToCart(Model model, HttpSession session, @Valid Item item, BindingResult bindResult) {
        
        //Retrieve cart onject from session
        Cart cart = (Cart)session.getAttribute("cart");
        
        if(bindResult.hasErrors()){
            model.addAttribute("cart", cart);
            return "cart";
        }
        else {
        cart.addItemToCart(item); //add item from form input to list of content in cart
        model.addAttribute("item", item);
        model.addAttribute("cart", cart);
        return "cart";
        }

    }

    @PostMapping(path="/checkout")
    public String checkOutCart(Model model, HttpSession session){

        //Retrieve cart onject from session
        Cart cart = (Cart)session.getAttribute("cart");
        model.addAttribute("cart", cart);

        //Destroy session
        session.invalidate();
        return "checkout";

    }
    
}
