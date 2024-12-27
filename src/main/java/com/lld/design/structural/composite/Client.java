package com.lld.design.structural.composite;

public class Client {
    public static void main(String[] args) {
        FileSystem parentDir = new Directory(
                new File("txt", 100),
                new File("xml", 200),
                new File("json", 300),
                new Directory(
                        new File("txt", 100),
                        new File("xml", 200)
                ),
                new Directory(
                        new File("txt", 100),
                        new File("xml", 200)
                )
        );
        System.out.println(parentDir.getSize());

    }
}
