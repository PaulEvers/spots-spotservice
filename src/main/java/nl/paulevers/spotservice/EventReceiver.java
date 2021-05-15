package nl.paulevers.spotservice;

import nl.paulevers.spotservice.entities.Spot;
import nl.paulevers.spotservice.events.MqEvent;
import nl.paulevers.spotservice.repositories.SpotsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventReceiver {

    @Autowired
    private SpotsRepository repository;
    private Logger log = LoggerFactory.getLogger(EventReceiver.class);

    @RabbitListener(queues = "spotsQueue")
    public void receive(MqEvent event) {
        switch (event.getEventType()) {
            case SpotLikedEvent:
                Spot spotToIncrement = repository.findById((String)event.getData()).get();
                spotToIncrement.incrementLike();
                repository.save(spotToIncrement);
                break;
            case SpotUnlikedEvent:
                Spot spotToDecrement = repository.findById((String)event.getData()).get();
                spotToDecrement.decrementLike();
                repository.save(spotToDecrement);
                break;
            default:
                log.error("Received unkown event: " + event.getEventType().name());
        }
    }
}

