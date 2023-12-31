package com.bnta.chocolate;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
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

    @Autowired
    EstateRepository estateRepository;


    @Override
    public void run(ApplicationArguments args) {

        List<Chocolate> chocolates = Arrays.asList(
                new Chocolate("Bounty",10,new Estate("Havana","Cuba")),
                new Chocolate("Bounty",10,new Estate("Havana","Cuba")),
                new Chocolate("Bounty",10,new Estate("Havana","Cuba")),
                new Chocolate("Bounty",10,new Estate("Havana","Cuba"))
                );

        List<Estate> estates = Arrays.asList( new Estate("Havana","Cuba"),
                new Estate("Havana","Cuba"),
                new Estate("Havana","Cuba"),
                new Estate("Havana","Cuba")
        );

        for (Chocolate chocolate : chocolates) {
            Chocolate chocolateName = new Chocolate(chocolate.getName(),chocolate.getCocoaPercentage(),chocolate.getEstate());
            chocolateRepository.save(chocolateName);
        }

        for (Estate estate : estates) {
            Estate estateName = new Estate(estate.getName(), estate.getCountry());
            estateRepository.save(estateName);
        }

    }
}
