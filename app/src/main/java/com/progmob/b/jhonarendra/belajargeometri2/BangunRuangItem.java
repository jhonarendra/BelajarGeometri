package com.progmob.b.jhonarendra.belajargeometri2;

/**
 * Created by Jhonarendra on 6/2/2018.
 */

public class BangunRuangItem {
    public String NamaBangunRuang;
    public String DescBangunRuang;
    public String LuasBangunRuang;
    public String VolumeBangunRuang;
    public int ThumbBangunRuang;
    public int WhiteThumbBangunRuang;
    public int RumusBangunRuang;

    public BangunRuangItem(String namaBangunRuang, String descBangunRuang, int thumbBangunRuang, int whiteThumbBangunRuang, String luasBangunRuang, String volumeBangunRuang, int rumusBangunRuang){
        this.NamaBangunRuang = namaBangunRuang;
        this.DescBangunRuang = descBangunRuang;
        this.LuasBangunRuang = luasBangunRuang;
        this.VolumeBangunRuang = volumeBangunRuang;
        this.ThumbBangunRuang = thumbBangunRuang;
        this.WhiteThumbBangunRuang = whiteThumbBangunRuang;
        this.RumusBangunRuang = rumusBangunRuang;
    }

    public String getDescBangunRuang() {
        return DescBangunRuang;
    }

    public String getLuasBangunRuang() {
        return LuasBangunRuang;
    }

    public String getNamaBangunRuang() {
        return NamaBangunRuang;
    }

    public int getThumbBangunRuang() {
        return ThumbBangunRuang;
    }

    public int getWhiteThumbBangunRuang() {
        return WhiteThumbBangunRuang;
    }

    public String getVolumeBangunRuang() {
        return VolumeBangunRuang;
    }

    public int getRumusBangunRuang() {
        return RumusBangunRuang;
    }
}
