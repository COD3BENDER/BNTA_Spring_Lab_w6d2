package com.bnta.chocolate;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ChocolateRepository chocolateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        List<String> chocolates = Arrays.asList(
                "safari",
                "volcano",
                "throne",
                "constraint",
                "copper",
                "fence",
                "porter",
                "grandfather",
                "oral",
                "enemy",
                "cry",
                "gate",
                "different",
                "harmony",
                "dream",
                "management",
                "finance",
                "set",
                "display",
                "burn",
                "frank",
                "overcharge",
                "heron",
                "inappropriate",
                "dose",
                "hover",
                "literacy",
                "campaign",
                "twin",
                "revenge",
                "swallow",
                "ignore",
                "rack",
                "treatment",
                "government",
                "weight",
                "beard",
                "insurance",
                "sum",
                "sail",
                "creation",
                "soldier",
                "develop",
                "parking",
                "permanent",
                "surprise",
                "virgil",
                "lie",
                "valley",
                "hell"
        );

        for (String rawWord : chocolates) {
            Chocolate chocolate = new Chocolate(chocolates);
            chocolateRepository.save(chocolate);
        }

    }
}
