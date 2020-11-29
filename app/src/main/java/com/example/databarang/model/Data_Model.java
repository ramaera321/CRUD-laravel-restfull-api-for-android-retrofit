package com.example.databarang.model;

import com.google.gson.annotations.SerializedName;

public class Data_Model {

    @SerializedName("id")
    private String id;
    @SerializedName("nama")
    private String nama;
    @SerializedName("jumlah")
    private String jumlah;

    public String getKode_barang() {
        return id;
    }

    public void setKode_barang(String id) {
        this.id = id;
    }

    public String getNama_barang() {
        return nama;
    }

    public void setNama_barang(String nama) {
        this.nama = nama;
    }

    public String getJumlah_barang() {
        return jumlah;
    }

    public void setJumlah_barang(String jumlah) {
        this.jumlah = jumlah;
    }
}
