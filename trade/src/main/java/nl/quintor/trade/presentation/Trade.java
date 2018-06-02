package nl.quintor.trade.presentation;

import nl.quintor.trade.repository.TradeRepository;
import nl.quintor.trade.vo.Coin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Trade {

    @Autowired
    TradeRepository tradeRepository;

    @GetMapping("/list")
    public ResponseEntity<List<Coin>> list(){
        return ResponseEntity.ok(tradeRepository.getAllTrades());
    }


}
