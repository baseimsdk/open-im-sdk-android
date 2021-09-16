package io.openim.android.sdk.models;

public class FileElem {
    /**
     * 文件本地资源地址
     */
    private String filePath;
    /**
     *
     */
    private String uuID;
    /**
     * oss地址
     */
    private String sourceUrl;
    /**
     * 文件名称
     */
    private String fileName;
    /**
     * 文件大小
     */
    private long fileSize;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getUuID() {
        return uuID;
    }

    public void setUuID(String uuID) {
        this.uuID = uuID;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }
}
