package com.chuange.aishijing.util;

public class NotifyData {
	private String fileId;//文件唯一id
	private String fileName;//文件展示名称
	private String coverUrl;//文件封面地址
	private String fileUrl;//文件播放地址
	private String author;//作者信息
	private String sourceType;//文件的上传来源。目前有Record：录制，ClientUpload：客户端上传，ServerUpload：服务端上传
	private String sourceContext;//上传时指定透传的字段，该字段目前最多256字节。
	private String streamId;//推流id，录制上传特有
	private String procedureTaskId;//该视频上传之后进行了指定流程，则该参数为流程任务id
	private String transcodeTaskId;//如果该视频上传之后发起了转码，则该参数为转码任务id
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getCoverUrl() {
		return coverUrl;
	}
	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	public String getSourceContext() {
		return sourceContext;
	}
	public void setSourceContext(String sourceContext) {
		this.sourceContext = sourceContext;
	}
	public String getStreamId() {
		return streamId;
	}
	public void setStreamId(String streamId) {
		this.streamId = streamId;
	}
	public String getProcedureTaskId() {
		return procedureTaskId;
	}
	public void setProcedureTaskId(String procedureTaskId) {
		this.procedureTaskId = procedureTaskId;
	}
	public String getTranscodeTaskId() {
		return transcodeTaskId;
	}
	public void setTranscodeTaskId(String transcodeTaskId) {
		this.transcodeTaskId = transcodeTaskId;
	}
	public NotifyData() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "NotifyData [fileId=" + fileId + ", fileName=" + fileName + ", coverUrl=" + coverUrl + ", fileUrl="
				+ fileUrl + ", author=" + author + ", sourceType=" + sourceType + ", sourceContext=" + sourceContext
				+ ", streamId=" + streamId + ", procedureTaskId=" + procedureTaskId + ", transcodeTaskId="
				+ transcodeTaskId + "]";
	}
	
	
}
