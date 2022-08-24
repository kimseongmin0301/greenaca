package com.food.model;

public class AttachFileVO {
    // 파일이 저장되어 있는 경로
    private String uploadPath;
    // 업로드된 파일명
    private String fileName;
    // uuid
    private String uuid;
    // 업로드된 파일이 이미지 파일인지 판별
    private boolean image;

    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public boolean isImage() {
        return image;
    }

    public void setImage(boolean image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "AttachFileVO{" +
                "uploadPath='" + uploadPath + '\'' +
                ", fileName='" + fileName + '\'' +
                ", uuid='" + uuid + '\'' +
                ", image=" + image +
                '}';
    }
}
