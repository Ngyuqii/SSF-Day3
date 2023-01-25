package SSF.HttpSession.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping(path="/cart")
public class ShoppingCartController {

    @GetMapping
    public String getCart(Model model, HttpSession session) {
        Cart cart = (Cart)session.getAttribute(cart);

        if (cart == null) {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }

        model.addAttribute

        return "cart";

    }

    @PostMapping

    
}
