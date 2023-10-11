package pro.sky.agapov.springbasket.service;

import org.springframework.stereotype.Service;
import pro.sky.agapov.springbasket.model.Basket;

import java.util.List;
import java.util.Map;

@Service
public class BasketService {
    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public List<Integer> add(List<Integer> ids) {
        return basket.add(ids);
    }

    public Map<Integer, Integer> get() {
        return basket.get();
    }
}
