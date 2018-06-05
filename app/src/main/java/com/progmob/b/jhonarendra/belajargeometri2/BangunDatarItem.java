package com.progmob.b.jhonarendra.belajargeometri2;

/**
 * Created by Jhonarendra on 6/1/2018.
 */

public class BangunDatarItem {
    public String NamaBangunDatar;
    public String DescBangunDatar;
    public String KelilingBangunDatar;
    public String LuasBangunDatar;
    public int ThumbBangunDatar;
    public int WhiteThumbBangunDatar;
    public int RumusBangunDatar;

    public BangunDatarItem(String namaBangunDatar, String descBangunDatar, int thumbBangunDatar, int whiteThumbBangunDatar, String kelilingBangunDatar, String luasBangunDatar, int rumusBangunDatar){
        this.NamaBangunDatar = namaBangunDatar;
        this.DescBangunDatar = descBangunDatar;
        this.ThumbBangunDatar = thumbBangunDatar;
        this.WhiteThumbBangunDatar = whiteThumbBangunDatar;
        this.KelilingBangunDatar = kelilingBangunDatar;
        this.LuasBangunDatar = luasBangunDatar;
        this.RumusBangunDatar = rumusBangunDatar;
    }

    public String getNamaBangunDatar(){
        return NamaBangunDatar;
    }

    public int getThumbBangunDatar(){
        return ThumbBangunDatar;
    }

    public int getWhiteThumbBangunDatar() {
        return WhiteThumbBangunDatar;
    }

    public String getDescBangunDatar() {
        return DescBangunDatar;
    }

    public String getKelilingBangunDatar() {
        return KelilingBangunDatar;
    }

    public String getLuasBangunDatar() {
        return LuasBangunDatar;
    }

    public int getRumusBangunDatar() {
        return RumusBangunDatar;
    }
}
