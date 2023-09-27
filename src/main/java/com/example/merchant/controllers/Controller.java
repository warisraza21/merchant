package com.example.merchant.controllers;

import com.example.merchant.models.MerchantDTO;
import com.example.merchant.models.PaymentDTO;
import com.example.merchant.models.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/")
public class Controller {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @PostMapping("register_merchant")
    public ResponseEntity<?> createMerchant(@RequestBody MerchantDTO merchantDTO){
        try{
            ResponseDTO responseDTO = webClientBuilder
                    .baseUrl("http://localhost:8082")
                    .build()
                    .post()
                    .uri("/api/register_merchant")
                    .accept(MediaType.APPLICATION_JSON)
                    .contentType(MediaType.APPLICATION_JSON) // Set the content type
                    .body(Mono.just(merchantDTO),MerchantDTO.class)
                    .retrieve()
                    .bodyToMono(ResponseDTO.class)
                    .block();
            return new ResponseEntity<>(responseDTO,HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(new ResponseDTO(false,e.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("payment")
    public ResponseEntity<?> doPayment(@RequestBody PaymentDTO paymentDTO){
        try{
           ResponseDTO responseDTO = webClientBuilder
                    .baseUrl("http://localhost:8082")
                    .build()
                    .post()
                    .uri("/api/payment")
                    .accept(MediaType.APPLICATION_JSON)
                    .contentType(MediaType.APPLICATION_JSON) // Set the content type
                    .body(Mono.just(paymentDTO),PaymentDTO.class)
                    .retrieve()
                    .bodyToMono(ResponseDTO.class)
                    .block();

            return new ResponseEntity<>(responseDTO,HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(new ResponseDTO(false,e.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("payment_status/{paymentId}")
    public ResponseEntity<?> getPaymentStatus(@PathVariable("paymentId") String paymentId){
        try{
            ResponseDTO responseDTO = webClientBuilder
                    .baseUrl("http://localhost:8082")
                    .build()
                    .get()
                    .uri("/api/payment_status/" + paymentId)
                    .retrieve()
                    .bodyToMono(ResponseDTO.class)
                    .block();

            return new ResponseEntity<>(responseDTO,HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(new ResponseDTO(false,e.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

