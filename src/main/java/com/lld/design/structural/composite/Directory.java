package com.lld.design.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Directory implements FileSystem {
    private List<FileSystem> compositeList = new ArrayList<>();

    public Directory(FileSystem... compositeList) {
        this.compositeList.addAll(Arrays.stream(compositeList).collect(Collectors.toList()));
    }

    @Override
    public long getSize() {
        //long sum = compositeList.stream().mapToLong(FileSystem::getSize).sum();
        long sum = 0;
        for (FileSystem file : compositeList) {
            sum += file.getSize();
        }
        return sum;
    }
}
