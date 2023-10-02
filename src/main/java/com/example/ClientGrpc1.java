package com.example;

import com.example.stubs.Bank;
import com.example.stubs.BankServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class ClientGrpc1 {
    public static void main(String[] args) throws IOException {
        // create managed channel to specify our server
        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",5555)
                .usePlaintext()
                .build();
//a blocking/synchronous stub: this means that the RPC call waits for the server to respond, and will either return a response or raise an exception
        BankServiceGrpc.BankServiceStub asynstub  =BankServiceGrpc.newStub(managedChannel);
        Bank.ConvertCurrencyRequest request= Bank.ConvertCurrencyRequest.newBuilder()
                .setCurrencyFrom("USD")
                .setCurrencyTo("EUR")
                .setAmount(8700)
                .build();
        System.out.println(request.toString());
        //a non-blocking/asynchronous stub that makes non-blocking calls to the server, where the response is returned asynchronously
        asynstub.convert(request, new StreamObserver<Bank.ConvertCurrencyResponse>() {
            @Override
            public void onNext(Bank.ConvertCurrencyResponse convertCurrencyResponse) {
                System.out.println(convertCurrencyResponse);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("END.......");
            }
        });
        System.out.println("11111111111");
        //block app, await client send signal
        System.in.read();


    }
}
