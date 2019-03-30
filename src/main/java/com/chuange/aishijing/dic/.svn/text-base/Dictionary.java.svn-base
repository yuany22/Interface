package com.chuange.aishijing.dic;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author yuany
 * 字典表
 *
 */
@Entity
@Table(name="ASJ_Dict")
public class Dictionary {
	@Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String typeCode;
	private String name;
	private String value;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Dictionary [id=" + id + ", typeCode=" + typeCode + ", name=" + name + ", value=" + value + "]";
	}
	public Dictionary(@NotNull Integer id, String typeCode, String name, String value) {
		super();
		this.id = id;
		this.typeCode = typeCode;
		this.name = name;
		this.value = value;
	}
	public Dictionary() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
