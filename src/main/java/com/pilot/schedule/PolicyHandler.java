package com.pilot.schedule;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.pilot.schedule.config.kafka.KafkaProcessor;

@Service
public class PolicyHandler {

	@StreamListener(KafkaProcessor.INPUT)
	public void onStringEventListener(@Payload String eventString) {
		
	}
}
