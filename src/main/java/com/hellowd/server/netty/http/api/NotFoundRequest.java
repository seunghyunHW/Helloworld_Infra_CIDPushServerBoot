package com.hellowd.server.netty.http.api;

import com.hellowd.server.netty.http.RestApiRequestTemplate;
import com.hellowd.server.netty.http.exception.RequestParamException;
import com.hellowd.server.netty.http.exception.ServiceException;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Helloworld
 * User : USER
 * Date : 2016-01-12
 * Time : 오후 2:55
 * To change this template use File | Settings | File and Code Templates.
 */
@Service("NotFoundRequest")
@Scope("prototype")
public class NotFoundRequest extends RestApiRequestTemplate {

    public NotFoundRequest(Map<String, String> reqData){
        super(reqData);
    }

    @Override
    public void requestParamValidation() throws RequestParamException {
    }

    @Override
    public void service() throws ServiceException {
        this.apiResult.addProperty("resultCode", "404");
        this.apiResult.addProperty("resultMessage", "존재하지 않는 서비스입니다.");
    }
}
