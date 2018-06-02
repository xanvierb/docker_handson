package nl.quintor.trade;

import nl.quintor.trade.repository.TradeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TradeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeApplication.class, args);
	}


	@Bean
	public TradeRepository tradeRepository() {
		return new TradeRepository();
	}

}