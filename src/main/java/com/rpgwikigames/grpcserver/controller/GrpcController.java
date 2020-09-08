package com.rpgwikigames.grpcserver.controller;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rpgwikigames.grpcserver.grpc.User.LoginRequest;
import com.rpgwikigames.grpcserver.service.AccountService;

@GRpcService
@RequestMapping("/api")
public class GrpcController {
	@Autowired
    private AccountService accountService;

    @PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(accountService.login(request));
    }
}
