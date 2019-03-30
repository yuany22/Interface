package com.chuange.aishijing.pojo.filemanager;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="ASJ_FILEMANAGER")
public class FileManage {
	@Id
	@NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    private String fileName;
    private String filePath;
    private String logger;
    private String suffixName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getLogger() {
		return logger;
	}
	public void setLogger(String logger) {
		this.logger = logger;
	}
	public String getSuffixName() {
		return suffixName;
	}
	public void setSuffixName(String suffixName) {
		this.suffixName = suffixName;
	}
	@Override
	public String toString() {
		return "FileManage [id=" + id + ", fileName=" + fileName + ", filePath=" + filePath + ", logger=" + logger
				+ ", suffixName=" + suffixName + "]";
	}
	public FileManage(@NotNull String id, String fileName, String filePath, String logger, String suffixName) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.filePath = filePath;
		this.logger = logger;
		this.suffixName = suffixName;
	}
	public FileManage() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
