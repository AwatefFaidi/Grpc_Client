package com.example;

import com.example.stubs.Bank;
import com.example.stubs.BankServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;

public class ClientGrpc {
    public static void main(String[] args) throws IOException {
           // create managed channel to specify our server
        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",5555)
                .usePlaintext()
                .build();
//a blocking/synchronous stub: this means that the RPC call waits for the server to respond, and will either return a response or raise an exception
        BankServiceGrpc.BankServiceBlockingStub blockingStub  =BankServiceGrpc.newBlockingStub(managedChannel);
        Bank.ConvertCurrencyRequest request= Bank.ConvertCurrencyRequest.newBuilder()
                .setCurrencyFrom("USD")
                .setCurrencyTo("EUR")
                .setAmount(8700)
                .build();
        System.out.println(request.toString());
        Bank.ConvertCurrencyResponse response = blockingStub.convert(request);
        System.out.println(response);

}
}
