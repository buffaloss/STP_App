package com.example.stptest

data class LoginResponse(
    val accessToken: String,
    val refreshToken: String
)

data class SignupResponse(
    val accessToken: String,
    val refreshToken: String
)

data class RefreshResponse(
    val refreshToken: String
)

data class ProtectedResponse(
    val idkToken: String
)