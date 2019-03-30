package com.chuange.aishijing.service.checkSystem;


import com.chuange.aishijing.pojo.checkSystem.CastCertified;
import com.chuange.aishijing.pojo.checkSystem.Certification;
import com.chuange.aishijing.pojo.checkSystem.StarCertified;

/**
 * Created by Administrator on 2018-11-12.
 */
public interface AuditSystemService {
	/*
	 * 实名认证申请
	 */
	public Certification realCertified(Certification certify);
	public StarCertified starCertified(StarCertified starCertify);
	public CastCertified castCertified(CastCertified castCertify);
	
}
