package com.kuang.demo01;

public class Proxy implements Rect{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rend() {
        host.rend();
        seeHourse();
        hetong();
        free();
    }
    public void seeHourse(){
        System.out.println("中介带你看房");
    }
    public void hetong(){
        System.out.println("签租赁合同");
    }
    public void free(){
        System.out.println("收中介费");
    }
}
