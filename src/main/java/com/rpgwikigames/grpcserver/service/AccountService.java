package com.rpgwikigames.grpcserver.service;

import org.springframework.stereotype.Service;

import com.rpgwikigames.grpcserver.grpc.User.APIResponse;
import com.rpgwikigames.grpcserver.grpc.User.LoginRequest;

//import com.rpgwikigames.grpcserver.model.AccountServiceGrpc.AccountServiceImplBase;

@Service
public class AccountService  {

	public APIResponse login(LoginRequest request) {
        return APIResponse.newBuilder()
            .setReponseCode(0)
            .setResponseMessage("Success")
            .build();
    }
//	@Override
//	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
//		String username = request.getUsername();
//		String password = request.getPassword();
//
//		Builder response = APIResponse.newBuilder();
//		if (username.equals(password)) {
//			response.setReponseCode(0).setResponseMessage("SUCCESS");
//		}
//		
//		responseObserver.onNext(response.build());
//		responseObserver.onCompleted();
//	}
//
//	@Override
//	public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
//		
//	}

}
