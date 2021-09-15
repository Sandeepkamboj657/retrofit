package com.sandeepkambojiftmu.hubcoretrofitapi;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {

    @POST("/api/sign-in")
   Call<LoginResponse> userLogin(@Body LoginRequest loginRequest);

}
