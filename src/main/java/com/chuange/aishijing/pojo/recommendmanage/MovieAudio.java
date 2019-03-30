package com.chuange.aishijing.pojo.recommendmanage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author yuany
 * 影视原声
 */
@Entity
@Table(name="ASJ_MOVIEAUDIO")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class MovieAudio {
	@Id
	@NotNull
	@GeneratedValue(generator="system_uuid")
	@GenericGenerator(name="system_uuid",strategy="uuid")
	private String id;
	private String castname;//剧本名称
	private String castAuthor;//剧本原作
	private String showterminal;//展示终端
	private String subtitleUrl; //字幕
	private String audioUrl;//音频
	private String status;//状态
	public MovieAudio(){}

	public MovieAudio(String castname, String castAuthor, String showterminal, String subtitleUrl, String audioUrl, String status) {
		this.castname = castname;
		this.castAuthor = castAuthor;
		this.showterminal = showterminal;
		this.subtitleUrl = subtitleUrl;
		this.audioUrl = audioUrl;
		this.status = status;
	}

	@Override
	public String toString() {
		return "MovieAudio{" +
				"id='" + id + '\'' +
				", castname='" + castname + '\'' +
				", castAuthor='" + castAuthor + '\'' +
				", showterminal='" + showterminal + '\'' +
				", subtitleUrl='" + subtitleUrl + '\'' +
				", audioUrl='" + audioUrl + '\'' +
				", status='" + status + '\'' +
				'}';
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCastname() {
		return castname;
	}

	public void setCastname(String castname) {
		this.castname = castname;
	}

	public String getCastAuthor() {
		return castAuthor;
	}

	public void setCastAuthor(String castAuthor) {
		this.castAuthor = castAuthor;
	}

	public String getShowterminal() {
		return showterminal;
	}

	public void setShowterminal(String showterminal) {
		this.showterminal = showterminal;
	}

	public String getSubtitleUrl() {
		return subtitleUrl;
	}

	public void setSubtitleUrl(String subtitleUrl) {
		this.subtitleUrl = subtitleUrl;
	}

	public String getAudioUrl() {
		return audioUrl;
	}

	public void setAudioUrl(String audioUrl) {
		this.audioUrl = audioUrl;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}