package nl.quintor.trade.repository;

import nl.quintor.trade.vo.Coin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TradeRepository {

    private List<Coin> list;

    public TradeRepository(){
        list = new ArrayList<Coin>();

        Coin c1 = new Coin("ThiefCoin", 24, new BigDecimal(0.0043));
        Coin c2 = new Coin("ThiefCoin", 32, new BigDecimal(0.0024));
        Coin c3 = new Coin("ThiefCoin", 12, new BigDecimal(0.0074));
        Coin c4 = new Coin("ThiefCoin", 22, new BigDecimal(0.0049));
        Coin c5 = new Coin("ThiefCoin", 24, new BigDecimal(0.0023));

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
    }

    public List<Coin> getAllTrades(){
        return list;
    }
}
