package com.example;

import com.example.stubs.Bank;
import com.example.stubs.BankServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class ClientGrpc2 {
    public static void main(String[] args) throws IOException {
        // create managed channel to specify our server
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 5555)
                .usePlaintext()
                .build();
//a blocking/synchronous stub: this means that the RPC call waits for the server to respond, and will either return a response or raise an exception
        BankServiceGrpc.BankServiceStub asynstub = BankServiceGrpc.newStub(managedChannel);
        Bank.ConvertCurrencyRequest request = Bank.ConvertCurrencyRequest.newBuilder()
                .setCurrencyFrom("USD")
                .setCurrencyTo("EUR")
                .setAmount(8700)
                .build();
        System.out.println(request.toString());
        //a non-blocking/asynchronous stub that makes non-blocking calls to the server, where the response is returned asynchronously
        StreamObserver<Bank.ConvertCurrencyRequest> performstream =
                asynstub.performstream(new StreamObserver<Bank.ConvertCurrencyResponse>() {
                    @Override
                    public void onNext(Bank.ConvertCurrencyResponse convertCurrencyResponse) {
                        System.out.println("result"+convertCurrencyResponse);
                    }

                    @Override
                    public void onError(Throwable throwable) {

                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("Ennnnnnnnnnnnnnnnd");

                    }
                });
        Timer count = new Timer();
        count.schedule(new TimerTask() {
            int counter = 0;

            @Override
            public void run() {
                Bank.ConvertCurrencyRequest request = Bank.ConvertCurrencyRequest.newBuilder()
                        .setAmount(Math.random() * 7800)
                        .build();
                performstream.onNext(request);
                System.out.println(counter);
                ++counter;

                if(counter==10){

                    performstream.onCompleted();
                    count.cancel();
                }
            }
            }, 1000, 1000);


        System.in.read();

    }
}
