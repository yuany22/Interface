package com.chuange.aishijing.service.impl.checkSystem;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuange.aishijing.dao.auditsystem.AuditSystem;
import com.chuange.aishijing.dao.auditsystem.CastCertifiedDao;
import com.chuange.aishijing.dao.auditsystem.StarCertifiedDao;
import com.chuange.aishijing.pojo.checkSystem.CastCertified;
import com.chuange.aishijing.pojo.checkSystem.Certification;
import com.chuange.aishijing.pojo.checkSystem.StarCertified;
import com.chuange.aishijing.service.checkSystem.AuditSystemService;

@Service
@Transactional
public class AuditSystemServiceImpl implements AuditSystemService{
	@Autowired
    private AuditSystem auditSystem;
    @Autowired
    private StarCertifiedDao starCertifiedDao;
    @Autowired
    private CastCertifiedDao castCertifiedDao;
	@Override
	public Certification realCertified(Certification certify) {
		// TODO Auto-generated method stub
		return auditSystem.save(certify);
	}

	@Override
	public StarCertified starCertified(StarCertified starCertify) {
		// TODO Auto-generated method stub
		return starCertifiedDao.save(starCertify);
	}

	@Override
	public CastCertified castCertified(CastCertified castCertify) {
		// TODO Auto-generated method stub
		return castCertifiedDao.save(castCertify);
	}

}
