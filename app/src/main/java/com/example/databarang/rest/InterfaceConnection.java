package com.example.databarang.rest;

import com.example.databarang.Response.Data_Response;
import com.example.databarang.Response.Data_Response;
import com.example.databarang.model.Data_Model;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface InterfaceConnection {

    @GET("barang")
    Call<Data_Response> daftar_barang();

    @FormUrlEncoded
    @POST("barang/tambah_barang")
    Call<Data_Response> tambah_barang(
            @Field("nama") String nama,
            @Field("jumlah") String jumlah
    );

    @DELETE("barang/delete_barang/{id}")
    Call<Data_Response> hapus_barang(@Path("id") String id
    );

//    @Headers({"Content-Type: application/json"})
//    @PUT("barang/update/{id}")
//    Call<Data_Response> update_barang(@Path("id") String id,
//                                   @Body Data_Model data
//    );


//    @Multipart
//    @PUT("barang/update/{kode_barang}")
//    Call<Data_Response> update_barang(@Path("kode_barang") String id,
//                                      @Part("nama_barang") String nama_barang,
//                                      @Part("jumlah_barang") String jumlah_barang
//    );

    @FormUrlEncoded
    @PUT("barang/update_barang/{id}")
    Call<Data_Response> update_barang(@Path("id") String id,
                                      @Field("nama") String nama,
                                      @Field("jumlah") String jumlah
    );

    //@body tidak bisa digunakan bersama multipart
//    @Multipart
//    @PUT("barang/update/{kode_barang}")
//    Call<Data_Response> update_barang(@Path("kode_barang") String id,
//                                      @Body Data_Model data
//    );
}
