package com.lld.design.structural.composite;

public class File implements FileSystem {
    private long fileSize;
    private String fileType;

    public String getFileType() {
        return fileType;
    }

    public File(String fileType, long fileSize) {
        this.fileType = fileType;
        this.fileSize = fileSize;
    }

    @Override
    public long getSize() {
        return fileSize;
    }
}
