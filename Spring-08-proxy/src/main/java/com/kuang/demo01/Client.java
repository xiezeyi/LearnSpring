package com.kuang.demo01;

public class Client {
    public static void main(String[] args) {
        Host host=new Host();
//        host.rend();
        //代理角色 中介棒房东租房子，但是呢？代理一般会有一些附属操作
        //你不用面对房东，直接赵中介租房即可
        Proxy proxy=new Proxy(host);
        proxy.rend();
    }
}
