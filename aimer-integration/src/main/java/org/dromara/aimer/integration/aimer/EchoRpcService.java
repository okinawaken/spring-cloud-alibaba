package org.dromara.aimer.integration.aimer;

import lombok.extern.slf4j.Slf4j;
import org.dromara.aimer.api.service.EchoService;
import org.dromara.aimer.common.exception.RpcException;
import org.dromara.aimer.common.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Slf4j
@Service
public class EchoRpcService {

    @Autowired
    private EchoService echoService;

    public String echo(String str) {
        try {
            BaseResponse<String> result = echoService.echo(str);
            if (Objects.isNull(result)
                    || Objects.isNull(result.getData())) {
                log.error("EchoRpcService echo result is null，str：{}", str, new RpcException("result is null"));
                return null;
            }
            log.info("EchoRpcService echo str：{}，result：{}", str, result);
            return result.getData();
        } catch (Exception e) {
            log.error("EchoRpcService echo error，str：{}", str, e);
            return null;
        }
    }
}
