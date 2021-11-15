package io.sofastack.balance.manage.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import io.sofastack.balance.manage.facade.MengkaFacade;
import io.sofastack.balance.manage.utils.TimeUtil;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author mengka
 * @version 1.0
 * @date 2021/11/11 13:36
 */
@Service
@SofaService(interfaceType = MengkaFacade.class, uniqueId = "${service.unique.id}", bindings = { @SofaServiceBinding(bindingType = "bolt") })
public class MengkaImpl implements MengkaFacade {
    @Override
    public String getTime() {
        return "[Just for test.."+TimeUtil.toDate(new Date(),TimeUtil.FORMAT_YYYY_MM_DD_HH_MM_SS);
    }
}
