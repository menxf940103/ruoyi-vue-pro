package cn.iocoder.dashboard.modules.system.convert.auth;

import cn.iocoder.dashboard.modules.system.controller.auth.vo.session.SysUserSessionPageItemRespVO;
import cn.iocoder.dashboard.modules.system.dal.dataobject.auth.SysUserSessionDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SysUserSessionConvert {

    SysUserSessionConvert INSTANCE = Mappers.getMapper(SysUserSessionConvert.class);

    SysUserSessionPageItemRespVO convert(SysUserSessionDO session);

}
