package com.example.stptest

data class LoginRequest(
    val phoneNumber: String,
    val password: String,
    val emailAddress: String,
    val deviceName: String,
    val deviceSn: String
)

data class SignupRequest(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String,
    val password: String,
    val emailAddress: String,
    val deviceName: String,
    val deviceSn: String,
    val birthDate: String
)