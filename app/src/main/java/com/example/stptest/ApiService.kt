package com.example.stptest

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

interface ApiService {
    @POST("signup")
    suspend fun signup(@Body signupRequest: SignupRequest): Response<SignupResponse>

    @POST("login")
    suspend fun login(@Body loginRequest: LoginRequest): Response<LoginResponse>

    @GET("refresh")
    suspend fun refresh(): Response<RefreshResponse>

    @GET("protected")
    suspend fun protected(): Response<ProtectedResponse>

//    @PUT("update_user_information")
//    suspend fun updateUserInformation(@Body updateInfoRequest: UpdateInfoRequest): Response<UpdateInfoResponse>
//
//    @PUT("update_password")
//    suspend fun updatePassword(@Body updatePasswordRequest: UpdatePasswordRequest): Response<UpdatePasswordResponse>
//
//    @POST("buy_subscription")
//    suspend fun buySubscription(@Body buySubscriptionRequest: BuySubscriptionRequest): Response<BuySubscriptionResponse>
//
//    @GET("device_manager")
//    suspend fun getDeviceManager(): Response<DeviceManagerResponse>
//
//    @POST("device_manager")
//    suspend fun postDeviceManager(@Body deviceManagerRequest: DeviceManagerRequest): Response<DeviceManagerResponse>
//
//    @GET("payment_information")
//    suspend fun getPaymentInformation(): Response<PaymentInformationResponse>
//
//    @POST("payment_information")
//    suspend fun postPaymentInformation(@Body paymentInformationRequest: PaymentInformationRequest): Response<PaymentInformationResponse>
//
//    @GET("payment_manager")
//    suspend fun getPaymentManager(): Response<PaymentManagerResponse>
//
//    @POST("payment_manager")
//    suspend fun postPaymentManager(@Body paymentManagerRequest: PaymentManagerRequest): Response<PaymentManagerResponse>
}