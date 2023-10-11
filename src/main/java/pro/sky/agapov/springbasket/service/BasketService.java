package pro.sky.agapov.springbasket.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@SessionScope
public class BasketService {
    Map<Integer, Integer> items = new HashMap<>();

    public List<Integer> add(List<Integer> ids) {
        for (Integer i: ids) {
            if (items.containsKey(i)) {
                items.put(i, items.get(i) + 1);
            } else {
                items.put(i, 1);
            }
        }
        return ids;
    }

    public Map<Integer, Integer> get() {
        return items;
    }
}
